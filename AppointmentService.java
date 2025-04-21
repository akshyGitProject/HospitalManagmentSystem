package com.basicProject.HospitalManagment.Servises;

import com.basicProject.HospitalManagment.Dto.AppointmentDto;

import java.util.List;


public interface AppointmentService {

    AppointmentDto createPatient(AppointmentDto appointmentDto);

    AppointmentDto getPatientById(Long appointmentId);

    AppointmentDto updatePatient(AppointmentDto appointmentDto,Long appointmentId);

    AppointmentDto deletePatient(Long appointmentId);

    List<AppointmentDto> getAllPatient();
}
