package com.basicProject.HospitalManagment.Servises;

import com.basicProject.HospitalManagment.Dto.PatientDto;

import java.util.List;

public interface PatientService {

    PatientDto createPatient(PatientDto patientDto);

    PatientDto  getPatientById(Long patientId);

    PatientDto updatePatient(PatientDto patientDto,Long patientId);

    PatientDto deletePatient(Long patientId);

    List<PatientDto> getAllPatient();

}
