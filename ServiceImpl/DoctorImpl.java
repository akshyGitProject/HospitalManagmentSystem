package com.basicProject.HospitalManagment.Servises.ServiceImpl;

import com.basicProject.HospitalManagment.Dto.DoctorDto;
import com.basicProject.HospitalManagment.Entity.Doctor;
import com.basicProject.HospitalManagment.Servises.DoctorService;

import java.util.List;

public class DoctorImpl implements DoctorService {
    @Override
    public DoctorDto createPatient(DoctorDto doctorDto) {
        return null;
    }

    @Override
    public void getPatientById(int doctorId) {

    }

    @Override
    public DoctorDto updatePatient(DoctorDto doctorDto, int doctorId) {
        return null;
    }

    @Override
    public DoctorDto deletePatient(int doctorId) {
        return null;
    }

    @Override
    public List<DoctorDto> getAllPatient() {
        return List.of();
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
