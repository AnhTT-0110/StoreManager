/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.nuce.daotao.StoreManager.model.Bill;
import vn.edu.nuce.daotao.StoreManager.model.Position;
import vn.edu.nuce.daotao.StoreManager.model.Receipt;
import vn.edu.nuce.daotao.StoreManager.model.Staff;
import vn.edu.nuce.daotao.StoreManager.response.StaffResponse;
import vn.edu.nuce.daotao.StoreManager.respository.AccountRespository;
import vn.edu.nuce.daotao.StoreManager.respository.BillRespository;
import vn.edu.nuce.daotao.StoreManager.respository.PositionRespository;
import vn.edu.nuce.daotao.StoreManager.respository.ReceiptRespository;
import vn.edu.nuce.daotao.StoreManager.respository.StaffRespository;
import vn.edu.nuce.daotao.StoreManager.service.*;
import vn.edu.nuce.daotao.StoreManager.transfomer.StaffTransformer;

/**
 *
 * @author Anh
 */
@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRespository staffRespository;

    @Autowired
    private StaffTransformer staffTransformer;

    @Autowired
    private BillRespository billRespository;

    @Autowired
    private ReceiptRespository receiptRespository;

    @Autowired
    private PositionRespository positionRespository;

    @Autowired
    private AccountRespository accountRespository;

    @Override
    public List<StaffResponse> getAllStaffResponses() {
        List<Position> positions = positionRespository.findAll();
        return staffRespository
                .findAll()
                .stream()
                .map((Staff staff) -> staffTransformer.transformToResponse(staff, positions))
                .collect(Collectors.toList());
    }

    @Override
    public List<Object[]> getAllStaffResponseObjects() {
        List<Object[]> objects = new ArrayList<>();
        List<Staff> staffs = staffRespository.findAll();
        staffs.forEach((customer) -> {
            objects.add(staffTransformer.transform(customer));
        });
        return objects;
    }

    @Override
    public boolean updateStaff(int statusBtn, StaffResponse staffResponse) {
        int checkBtn = statusBtn;
        List<Position> positions = positionRespository.findAll();
        Staff staff = staffTransformer.transformToEntity(staffResponse, positions);
        switch (checkBtn) {
            case 2:
            case 3:
                staffRespository.save(staff);
                return true;
            case 4:
                staffRespository.delete(staff);
                return true;
        }
        return false;
    }

    @Override
    public boolean deleteStaff(StaffResponse staffResponse) {
        List<Position> positions = positionRespository.findAll();
        List<Bill> bills = billRespository.findAll();
        List<Receipt> receipts = receiptRespository.findAll();
        boolean checkBill = bills.stream().anyMatch(item -> item.getStaff().getCodeStaff() == Integer.valueOf(staffResponse.getCodeStaff()));
        boolean checkReceipt = receipts.stream().anyMatch(item -> item.getStaff().getCodeStaff() == Integer.valueOf(staffResponse.getCodeStaff()));
        boolean checkAccount = accountRespository.findAll().stream().anyMatch(item -> item.getStaff().getCodeStaff() == Integer.valueOf(staffResponse.getCodeStaff()));
        if (checkReceipt || checkBill || checkAccount) {
            return false;
        }
        Staff staff = staffTransformer.transformToEntity(staffResponse, positions);
        staffRespository.delete(staff);
        return true;
    }

}
