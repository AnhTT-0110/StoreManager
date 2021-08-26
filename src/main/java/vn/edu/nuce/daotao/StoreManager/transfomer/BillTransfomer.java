/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.transfomer;

import java.time.LocalDateTime;
import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import vn.edu.nuce.daotao.StoreManager.model.Bill;
import vn.edu.nuce.daotao.StoreManager.model.Customer;
import vn.edu.nuce.daotao.StoreManager.model.Staff;
import vn.edu.nuce.daotao.StoreManager.response.BillResponse;

/**
 *
 * @author Anh
 */
@Component
@Log4j2
public class BillTransfomer {

    public Object[] transform(Bill bill) {
        Object[] item = new Object[9];
        item[1] = bill.getCodeBill();
        item[2] = bill.getCustomer().getCodeCustomer();
        item[3] = bill.getCustomer().getNameCustomer();
        item[4] = bill.getStaff().getCodeStaff();
        item[5] = bill.getStaff().getNameStaff();
        item[6] = bill.getDate().toString();
        item[7] = String.format("%,.0f",bill.getTotalDcash());
        item[8] = bill.getDescription();
        return item;
    }
    
    public Object[] transformReport(Bill bill) {
        Object[] item = new Object[9];
        item[1] = bill.getCodeBill();
        item[2] = bill.getCustomer().getCodeCustomer();
        item[3] = bill.getCustomer().getNameCustomer();
        item[4] = bill.getStaff().getCodeStaff();
        item[5] = bill.getStaff().getNameStaff();
        item[6] = bill.getDate().toString();
        item[7] = String.valueOf(bill.getTotalDcash());
        item[8] = bill.getDescription();
        return item;
    }

    public Bill transformToEntity(BillResponse billResponse, List<Customer> customers, List<Staff> staffs) {
        Bill bill = new Bill();
        bill.setCodeBill(billResponse.getCodeBill().isEmpty() ? Integer.valueOf(0) : Integer.valueOf(billResponse.getCodeBill()));
        bill.setDate(LocalDateTime.parse(billResponse.getDate()));
        bill.setTotalDcash(Double.valueOf(billResponse.getTotalDcash()));
        bill.setDescription(billResponse.getDescription());
        bill.setDate_string(billResponse.getDate());
        customers
                .stream()
                .filter(type -> type.getCodeCustomer() == Integer.valueOf(billResponse.getCustomerCode()))
                .findAny()
                .ifPresent(item -> bill.setCustomer(item));
        staffs
                .stream()
                .filter(type -> type.getCodeStaff() == Integer.valueOf(billResponse.getStaffCode()))
                .findAny()
                .ifPresent(item -> bill.setStaff(item));
        return bill;
    }
    
    public BillResponse transformToReponse(Bill bill) {
        BillResponse billResponse = new BillResponse();
        billResponse.setCodeBill(String.valueOf(bill.getCodeBill()));
        billResponse.setDate(String.valueOf(bill.getDate()));
        billResponse.setTotalDcash(String.format("%,.0f",bill.getTotalDcash()));
        billResponse.setDescription(bill.getDescription());
        
        return billResponse;
    }

}
