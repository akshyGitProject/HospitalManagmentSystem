package com.basicProject.HospitalManagment.Servises.ServiceImpl;

import com.basicProject.HospitalManagment.Dto.BillDto;
import com.basicProject.HospitalManagment.Entity.Bill;
import com.basicProject.HospitalManagment.Exception.ResourceNotFoundException;
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
    public BillDto createBill(BillDto billDto) {

        Bill bill=dtoToEntity(billDto);

        Bill save = billRepo.save(bill);

        return billToDto(save);
    }

    @Override
    public BillDto getBillById(Long billId) {

        Bill bill=this.billRepo.findById(billId).orElseThrow(()->new ResourceNotFoundException("Bill","billId",billId));

    return billToDto(bill);
    }

    @Override
    public BillDto updateBill(BillDto billDto, Long billId) {
        Bill bill=billRepo.findById(billId).orElseThrow(
                ()->new ResourceNotFoundException("Bill","billId",billId));

        bill.setAmount(billDto.getAmount());
        bill.setPatientId(billDto.getPatientId());
        bill.setStatus(billDto.getStatus());

        return billToDto(bill);
    }

    @Override
    public BillDto deleteBill(Long billId) {

        Bill bill=billRepo.findById(billId).orElseThrow(
                ()->new ResourceNotFoundException("Bill","billId",billId));

        billRepo.delete(bill);

        return billToDto(bill);
    }

    @Override
    public List<BillDto> getAllBill() {
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

    public Bill dtoToEntity(BillDto billDto){

        Bill bill=new Bill();
        bill.setId(billDto.getId());
        bill.setAmount(billDto.getAmount());
        bill.setStatus(billDto.getStatus());
        bill.setPatientId(billDto.getPatientId());

        return bill;

    }


}
