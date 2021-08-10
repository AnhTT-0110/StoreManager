/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import vn.edu.nuce.daotao.StoreManager.model.Bill;
import vn.edu.nuce.daotao.StoreManager.model.Customer;
import vn.edu.nuce.daotao.StoreManager.model.Staff;
import vn.edu.nuce.daotao.StoreManager.response.BillResponse;
import vn.edu.nuce.daotao.StoreManager.respository.BillDetailRespository;
import vn.edu.nuce.daotao.StoreManager.respository.BillRespository;
import vn.edu.nuce.daotao.StoreManager.respository.CustomerRespository;
import vn.edu.nuce.daotao.StoreManager.respository.StaffRespository;
import vn.edu.nuce.daotao.StoreManager.service.*;
import vn.edu.nuce.daotao.StoreManager.transfomer.BillTransfomer;

/**
 *
 * @author Anh
 */
@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillRespository billRespository;

    @Autowired
    private BillTransfomer billTransfomer;

    @Autowired
    private StaffRespository staffRespository;

    @Autowired
    private CustomerRespository customerRespository;

    @Autowired
    private BillDetailRespository billDetailRespository;

    @Override
    public List<BillResponse> getAllBillResponses() {

        return null;
    }

    @Override
    public List<Object[]> getAllBillResponseObjects() {
        return billRespository
                .findAll(Sort.by("date"))
                .stream()
                .map(bill -> billTransfomer.transform(bill))
                .collect(Collectors.toList());
    }

    @Override
    public boolean updateBill(int statusBtn, BillResponse response) {
        int checkBtn = statusBtn;
        List<Customer> customers = customerRespository.findAll();
        List<Staff> staffs = staffRespository.findAll();
        Bill bill = billTransfomer.transformToEntity(response, customers, staffs);
        switch (checkBtn) {
            case 2:
            case 3:
                billRespository.save(bill);
                return true;
            case 4:
                billRespository.delete(bill);
                return true;
        }
        return false;
    }

    @Override
    public boolean deleteBill(BillResponse response) {
        List<Customer> customers = customerRespository.findAll();
        List<Staff> staffs = staffRespository.findAll();
        Bill bill = billTransfomer.transformToEntity(response, customers, staffs);
        boolean checkInCus = billDetailRespository.findAll().stream().anyMatch(item -> item.getBill().getCodeBill() == bill.getCodeBill());
        if (checkInCus) {
            return false;
        }
        billRespository.delete(bill);
        return true;
    }

}
