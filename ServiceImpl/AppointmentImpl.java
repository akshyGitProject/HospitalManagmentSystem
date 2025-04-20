package com.basicProject.HospitalManagment.Servises.ServiceImpl;

import com.basicProject.HospitalManagment.Dto.AppointmentDto;
import com.basicProject.HospitalManagment.Entity.Appointment;
import com.basicProject.HospitalManagment.Repositories.AppointmentRepo;
import com.basicProject.HospitalManagment.Servises.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentImpl implements AppointmentService {

    @Autowired
    private AppointmentRepo appointmentRepo;

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

 public AppointmentDto appointmentToDto(Appointment appointment){

     AppointmentDto appointmentDto=new AppointmentDto();
     appointmentDto.setId(appointment.getId());
     appointmentDto.setDate(appointment.getDate());
     appointmentDto.setDoctorId(appointment.getId());
     appointmentDto.setPatientId(appointment.getId());

     return appointmentDto;

 }

    public Appointment appointmentToDto(AppointmentDto appointmentDto){

        Appointment appointment=new Appointment();
        appointment.setId(appointmentDto.getId());
        appointment.setDate(appointmentDto.getDate());
        appointment.setDoctorId(appointmentDto.getId());
        appointment.setPatientId(appointmentDto.getId());

        return appointment;

    }


}
