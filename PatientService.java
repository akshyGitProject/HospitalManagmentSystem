package com.basicProject.HospitalManagment.Servises;

import com.basicProject.HospitalManagment.Dto.PatientDto;

import java.util.List;

public interface PatientService {

    PatientDto createPatient(PatientDto patientDto);

    void getPatientById(int patientId);

    PatientDto updatePatient(PatientDto patientDto,int patientId);

    PatientDto deletePatient(int patientId);

    List<PatientDto> getAllPatient();

}
