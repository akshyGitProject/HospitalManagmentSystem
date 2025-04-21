package com.basicProject.HospitalManagment.Servises.ServiceImpl;

import com.basicProject.HospitalManagment.Dto.PatientDto;
import com.basicProject.HospitalManagment.Entity.Patient;
import com.basicProject.HospitalManagment.Exception.ResourceNotFoundException;
import com.basicProject.HospitalManagment.Repositories.PatientRepo;
import com.basicProject.HospitalManagment.Servises.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientImpl implements PatientService{

    @Autowired
    private PatientRepo patientRepo;

    @Override
    public PatientDto createPatient(PatientDto patientDto) {

        Patient patient=this.dtoToEntity(patientDto); //DTO to Entity
        Patient save = patientRepo.save(patient);  //save patient to DB

        return patientToDto(save);

    }

    @Override
    public PatientDto getPatientById(Long patientId) {
        Patient patient=patientRepo.findById( patientId).orElseThrow(()->new ResourceNotFoundException("Patient","Patient",patientId));

        return patientToDto(patient);
    }

    @Override
    public PatientDto updatePatient(PatientDto patientDto, Long patientId) {
        Patient patient=patientRepo.findById(patientId).orElseThrow(()->new ResourceNotFoundException("Patient","PatientId",patientId));
        patient.setName(patientDto.getName());
        //patient.setId(patientDto.getId());
        patient.setGender(patientDto.getGender());
        patient.setAge(patientDto.getAge());

        Patient saved = patientRepo.save(patient);

        return patientToDto(saved);
    }


    @Override
    public PatientDto deletePatient(Long patientId) {

        Patient patient=patientRepo.findById(patientId).orElseThrow(()->new ResourceNotFoundException("Patient","PatientId",patientId));

        patientRepo.delete(patient);

        return patientToDto(patient);
    }

    @Override
    public List<PatientDto> getAllPatient() {
        List<Patient> patients=patientRepo.findAll();
        List<PatientDto> patientDtos=new ArrayList<>();

        for(Patient patient:patients){
            PatientDto patientDto=patientToDto(patient);
            patientDtos.add(patientDto);
        }

        return patientDtos;
    }


    public PatientDto patientToDto(Patient patient){

        PatientDto patientDto=new PatientDto();
        patientDto.setId(patient.getId());
        patientDto.setAge(patient.getAge());
        patientDto.setName(patient.getName());
        patientDto.setGender(patient.getGender());

        return patientDto;
    }

    public Patient dtoToEntity(PatientDto patientDto){

        Patient patient=new Patient();
        patient.setId(patientDto.getId());
        patient.setGender(patientDto.getGender());
        patient.setAge(patientDto.getAge());
        patient.setName(patientDto.getName());

        return patient;
    }

}
