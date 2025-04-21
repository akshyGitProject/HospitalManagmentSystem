package com.basicProject.HospitalManagment.Servises.ServiceImpl;

import com.basicProject.HospitalManagment.Dto.DoctorDto;
import com.basicProject.HospitalManagment.Entity.Doctor;
import com.basicProject.HospitalManagment.Exception.ResourceNotFoundException;
import com.basicProject.HospitalManagment.Repositories.DoctorRepo;
import com.basicProject.HospitalManagment.Servises.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorImpl implements DoctorService {

    @Autowired
    private DoctorRepo doctorRepo;

    @Override
    public DoctorDto createDoctor(DoctorDto doctorDto) {
        Doctor doctor=this.dtoToEntity(doctorDto);

        Doctor save = doctorRepo.save(doctor);

        return doctorToDto(save);
    }

    @Override
    public DoctorDto getDoctorById(Long doctorId) {
        Doctor doctor=this.doctorRepo.findById(doctorId).orElseThrow(
                ()->new ResourceNotFoundException("Doctor","DoctorId",doctorId));

        return doctorToDto(doctor);
    }

    @Override
    public DoctorDto updateDoctor(DoctorDto doctorDto, Long doctorId) {
        Doctor doctor=this.doctorRepo.findById(doctorId).orElseThrow(
                ()->new ResourceNotFoundException("Doctor","doctorId",doctorId));
        doctor.setAge(doctorDto.getAge());
        doctor.setName(doctor.getName());
        doctor.setSpeciality(doctorDto.getSpeciality());

        return doctorToDto(doctor);
    }

    @Override
    public DoctorDto deleteDoctor(Long doctorId) {
        Doctor doctor=this.doctorRepo.findById(doctorId).orElseThrow(
                ()->new ResourceNotFoundException("Doctor","doctorId",doctorId));

        doctorRepo.delete(doctor);

        return doctorToDto(doctor);
    }

    @Override
    public List<DoctorDto> getAllDoctor() {
        List<Doctor> doctors=doctorRepo.findAll();

        List<DoctorDto> doctorDtos=new ArrayList<>();

        for (Doctor doctor:doctors){

            DoctorDto doctorDto=doctorToDto(doctor);
            doctorDtos.add(doctorDto);
        }

        return doctorDtos;
    }

    public DoctorDto doctorToDto(Doctor doctor){

        DoctorDto doctorDto=new DoctorDto();
        doctorDto.setName(doctor.getName());
        doctorDto.setAge(doctor.getAge());
        doctorDto.setId(doctor.getId());
        doctorDto.setSpeciality(doctor.getSpeciality());

        return doctorDto;

    }


    public Doctor dtoToEntity(DoctorDto doctorDto){

        Doctor doctor=new Doctor();
        doctor.setName(doctorDto.getName());
        doctor.setAge(doctorDto.getAge());
        doctor.setId(doctorDto.getId());
        doctor.setSpeciality(doctorDto.getSpeciality());

        return doctor;

    }

}
