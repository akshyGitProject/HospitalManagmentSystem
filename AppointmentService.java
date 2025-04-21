package com.basicProject.HospitalManagment.Servises;

import com.basicProject.HospitalManagment.Dto.AppointmentDto;

import java.util.List;


public interface AppointmentService {

    AppointmentDto createAppointment(AppointmentDto appointmentDto);

    AppointmentDto getAppointmentById(Long appointmentId);

    AppointmentDto updateAppointment(AppointmentDto appointmentDto,Long appointmentId);

    AppointmentDto deleteAppointment(Long appointmentId);

    List<AppointmentDto> getAllAppointment();
}
