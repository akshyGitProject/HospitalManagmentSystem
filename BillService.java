package com.basicProject.HospitalManagment.Servises;

import com.basicProject.HospitalManagment.Dto.BillDto;

import java.util.List;

public interface BillService {

    BillDto createBill(BillDto billDto);

    BillDto getBillById(Long billId);

    BillDto updateBill(BillDto billDto,Long billId);

    BillDto deleteBill(Long billId);

    List<BillDto> getAllBill();
}
