package com.basicProject.HospitalManagment.Servises.ServiceImpl;

import com.basicProject.HospitalManagment.Dto.AppointmentDto;
import com.basicProject.HospitalManagment.Entity.Appointment;
import com.basicProject.HospitalManagment.Exception.ResourceNotFoundException;
import com.basicProject.HospitalManagment.Repositories.AppointmentRepo;
import com.basicProject.HospitalManagment.Servises.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentImpl implements AppointmentService {

    @Autowired
    private AppointmentRepo appointmentRepo;

    @Override
    public AppointmentDto createAppointment(AppointmentDto appointmentDto) {
        Appointment appointment=dtoToEntity(appointmentDto);

        Appointment saved = appointmentRepo.save(appointment);

        return appointmentToDto(saved);
    }

    @Override
    public AppointmentDto getAppointmentById(Long appointmentId) {

        Appointment appointment = appointmentRepo.findById(appointmentId).orElseThrow(
                () -> new ResourceNotFoundException("Appointment", "appointmentId", appointmentId));

        return appointmentToDto(appointment);
    }

    @Override
    public AppointmentDto updateAppointment(AppointmentDto appointmentDto, Long appointmentId) {
        Appointment appointment=appointmentRepo.findById(appointmentId).orElseThrow(
                () -> new ResourceNotFoundException("Appointment", "appointmentId", appointmentId));
        appointment.setDate(appointmentDto.getDate());
        appointment.setPatientId(appointmentDto.getPatientId());
        appointment.setDoctorId(appointmentDto.getDoctorId());

        return appointmentToDto(appointment);
    }

    @Override
    public AppointmentDto deleteAppointment(Long appointmentId) {
        Appointment appointment = appointmentRepo.findById(appointmentId).orElseThrow(
                () -> new ResourceNotFoundException("Appointment", "appointmentId", appointmentId));

        appointmentRepo.delete(appointment);

        return appointmentToDto(appointment);
    }

    @Override
    public List<AppointmentDto> getAllAppointment() {
        List<Appointment> appointments=appointmentRepo.findAll();
        List<AppointmentDto> appointmentDtos=new ArrayList<>();

        for(Appointment appointment:appointments){

            AppointmentDto appointmentDto=appointmentToDto(appointment);
            appointmentDtos.add(appointmentDto);

        }

        return appointmentDtos;
    }

 public AppointmentDto appointmentToDto(Appointment appointment){

     AppointmentDto appointmentDto=new AppointmentDto();
     appointmentDto.setId(appointment.getId());
     appointmentDto.setDate(appointment.getDate());
     appointmentDto.setDoctorId(appointment.getId());
     appointmentDto.setPatientId(appointment.getId());

     return appointmentDto;

 }

    public Appointment dtoToEntity(AppointmentDto appointmentDto){

        Appointment appointment=new Appointment();
        appointment.setId(appointmentDto.getId());
        appointment.setDate(appointmentDto.getDate());
        appointment.setDoctorId(appointmentDto.getId());
        appointment.setPatientId(appointmentDto.getId());

        return appointment;

    }


}
