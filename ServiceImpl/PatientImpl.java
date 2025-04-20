package com.basicProject.HospitalManagment.Servises.ServiceImpl;

import com.basicProject.HospitalManagment.Dto.PatientDto;
import com.basicProject.HospitalManagment.Entity.Patient;
import com.basicProject.HospitalManagment.Servises.PatientService;

import java.util.List;

public class PatientImpl implements PatientService{

    @Override
    public PatientDto createPatient(PatientDto patientDto) {
        return null;
    }

    @Override
    public void getPatientById(int patientId) {

    }

    @Override
    public PatientDto updatePatient(PatientDto patientDto, int patientId) {
        return null;
    }

    @Override
    public PatientDto deletePatient(int patientId) {
        return null;
    }

    @Override
    public List<PatientDto> getAllPatient() {
        return List.of();
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
