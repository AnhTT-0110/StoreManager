/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.transfomer;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import vn.edu.nuce.daotao.StoreManager.model.Distributor;
import vn.edu.nuce.daotao.StoreManager.model.Receipt;
import vn.edu.nuce.daotao.StoreManager.model.Staff;
import vn.edu.nuce.daotao.StoreManager.response.ReceiptResponse;

/**
 *
 * @author Anh
 */
@Component
@Log4j2
public class ReceiptTransformer {

    public Object[] transform(Receipt receipt) {
        Object[] item = new Object[9];
        item[1] = receipt.getCodeReceipt();
        item[2] = receipt.getDistributor().getCodeDistributor();
        item[3] = receipt.getDistributor().getNameDistributor();
        item[4] = receipt.getStaff().getCodeStaff();
        item[5] = receipt.getStaff().getNameStaff();
//        item[6] = receipt.getTotalDcash();
        item[6] = String.format("%,.2f",receipt.getTotalDcash());
        item[7] = receipt.getDate();
        item[8] = receipt.getDescription();
        return item;
    }

    public Receipt transformToEntity(ReceiptResponse response, List<Staff> staffs, List<Distributor> distributors) {
        Receipt receipt = new Receipt();
        receipt.setCodeReceipt(response.getCodeReceipt().isEmpty() ? Integer.valueOf(0) : Integer.valueOf(response.getCodeReceipt()));
        receipt.setTotalDcash(Double.valueOf(response.getTotalDcash()));
        receipt.setDate(LocalDateTime.parse(response.getDate()));
        receipt.setDateString(response.getDate());
        receipt.setDescription(response.getDescription());
        staffs
                .stream()
                .filter(staff -> staff.getCodeStaff() == (Integer.valueOf(response.getCodeStaff())))
                .findAny()
                .ifPresent(item -> receipt.setStaff(item));
        distributors
                .stream()
                .filter(distributor -> distributor.getCodeDistributor() == (Integer.valueOf(response.getCodeDistributor())))
                .findAny()
                .ifPresent(item -> receipt.setDistributor(item));
        return receipt;
    }

    public ReceiptResponse transformToResponse(Receipt receipt) {
        ReceiptResponse response = new ReceiptResponse();
        response.setCodeReceipt(String.valueOf(receipt.getCodeReceipt()));
        response.setCodeDistributor(String.valueOf(receipt.getDistributor().getCodeDistributor()));
        response.setCodeStaff(String.valueOf(receipt.getStaff().getCodeStaff()));
        response.setNameStaff(receipt.getStaff().getNameStaff());
        response.setNameDistributor(receipt.getDistributor().getNameDistributor());
        response.setTotalDcash(String.format("%,.2f",receipt.getTotalDcash()));
        response.setDate(receipt.getDate().toString());
        response.setDescription(receipt.getDescription());
        return response;
    }

}
