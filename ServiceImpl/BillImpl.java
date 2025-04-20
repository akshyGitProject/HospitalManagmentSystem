package com.basicProject.HospitalManagment.Servises.ServiceImpl;

import com.basicProject.HospitalManagment.Dto.BillDto;
import com.basicProject.HospitalManagment.Entity.Bill;
import com.basicProject.HospitalManagment.Repositories.BillRepo;
import com.basicProject.HospitalManagment.Servises.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillImpl implements BillService {

    @Autowired
    private BillRepo billRepo;

    @Override
    public BillDto createPatient(BillDto billDto) {
        return null;
    }

    @Override
    public void getPatientById(int billId) {

    }

    @Override
    public BillDto updatePatient(BillDto billDto, int billId) {
        return null;
    }

    @Override
    public BillDto deletePatient(int billId) {
        return null;
    }

    @Override
    public List<BillDto> getAllPatient() {
        return List.of();
    }

    public BillDto billToDto(Bill bill){

        BillDto billDto=new BillDto();
        billDto.setId(bill.getId());
        billDto.setAmount(bill.getAmount());
        billDto.setStatus(bill.getStatus());
        billDto.setPatientId(bill.getPatientId());

        return billDto;

    }

    public Bill billToDto(BillDto billDto){

        Bill bill=new Bill();
        bill.setId(billDto.getId());
        bill.setAmount(billDto.getAmount());
        bill.setStatus(billDto.getStatus());
        bill.setPatientId(billDto.getPatientId());

        return bill;

    }


}
