package com.basicProject.HospitalManagment.Servises.ServiceImpl;

import com.basicProject.HospitalManagment.Dto.AppointmentDto;
import com.basicProject.HospitalManagment.Servises.AppointmentService;

import java.util.List;

public class AppointmentImpl implements AppointmentService {
    @Override
    public AppointmentDto createPatient(AppointmentDto appointmentDto) {
        return null;
    }

    @Override
    public void getPatientById(int appointmentId) {

    }

    @Override
    public AppointmentDto updatePatient(AppointmentDto appointmentDto, int appointmentId) {
        return null;
    }

    @Override
    public AppointmentDto deletePatient(int appointmentId) {
        return null;
    }

    @Override
    public List<AppointmentDto> getAllPatient() {
        return List.of();
    }
}
