package com.basicProject.HospitalManagment.Servises;

import com.basicProject.HospitalManagment.Dto.DoctorDto;
import com.basicProject.HospitalManagment.Dto.PatientDto;

import java.util.List;

public interface DoctorService {

    DoctorDto createPatient(DoctorDto doctorDto);

    void getPatientById(int doctorId);

    DoctorDto updatePatient(DoctorDto doctorDto,int doctorId);

    DoctorDto deletePatient(int doctorId);

    List<DoctorDto> getAllPatient();
}
