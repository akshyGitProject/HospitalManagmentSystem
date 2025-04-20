package com.basicProject.HospitalManagment.Servises;

import com.basicProject.HospitalManagment.Dto.BillDto;
import com.basicProject.HospitalManagment.Dto.DoctorDto;

import java.util.List;

public interface BillService {

    BillDto createPatient(BillDto billDto);

    void getPatientById(int billId);

    BillDto updatePatient(BillDto billDto,int billId);

    BillDto deletePatient(int billId);

    List<BillDto> getAllPatient();
}
