package com.basicProject.HospitalManagment.Servises;

import com.basicProject.HospitalManagment.Dto.DoctorDto;
import com.basicProject.HospitalManagment.Dto.PatientDto;

import java.util.List;

public interface DoctorService {

    DoctorDto createPatient(DoctorDto doctorDto);

    DoctorDto getPatientById(Long doctorId);

    DoctorDto updatePatient(DoctorDto doctorDto,Long doctorId);

    DoctorDto deletePatient(Long doctorId);

    List<DoctorDto> getAllPatient();
}
