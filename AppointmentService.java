package com.basicProject.HospitalManagment.Servises;

import com.basicProject.HospitalManagment.Dto.AppointmentDto;

import java.util.List;


public interface AppointmentService {

    AppointmentDto createPatient(AppointmentDto appointmentDto);

    void getPatientById(int appointmentId);

    AppointmentDto updatePatient(AppointmentDto appointmentDto,int appointmentId);

    AppointmentDto deletePatient(int appointmentId);

    List<AppointmentDto> getAllPatient();
}
