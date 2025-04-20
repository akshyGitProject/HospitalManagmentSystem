package com.basicProject.HospitalManagment.Servises.ServiceImpl;

import com.basicProject.HospitalManagment.Dto.DoctorDto;
import com.basicProject.HospitalManagment.Servises.DoctorService;

import java.util.List;

public class DoctorImpl implements DoctorService {
    @Override
    public DoctorDto createPatient(DoctorDto doctorDto) {
        return null;
    }

    @Override
    public void getPatientById(int doctorId) {

    }

    @Override
    public DoctorDto updatePatient(DoctorDto doctorDto, int doctorId) {
        return null;
    }

    @Override
    public DoctorDto deletePatient(int doctorId) {
        return null;
    }

    @Override
    public List<DoctorDto> getAllPatient() {
        return List.of();
    }
}
