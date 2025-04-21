package com.basicProject.HospitalManagment.Servises;

import com.basicProject.HospitalManagment.Dto.DoctorDto;
import com.basicProject.HospitalManagment.Dto.PatientDto;

import java.util.List;

public interface DoctorService {

    DoctorDto createDoctor(DoctorDto doctorDto);

    DoctorDto getDoctorById(Long doctorId);

    DoctorDto updateDoctor(DoctorDto doctorDto,Long doctorId);

    DoctorDto deleteDoctor(Long doctorId);

    List<DoctorDto> getAllDoctor();
}
