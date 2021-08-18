/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import vn.edu.nuce.daotao.StoreManager.model.Receipt;
import vn.edu.nuce.daotao.StoreManager.model.Distributor;
import vn.edu.nuce.daotao.StoreManager.model.Staff;
import vn.edu.nuce.daotao.StoreManager.response.BillResponse;
import vn.edu.nuce.daotao.StoreManager.response.ReceiptResponse;
import vn.edu.nuce.daotao.StoreManager.respository.ReceiptRespository;
import vn.edu.nuce.daotao.StoreManager.respository.DetailInvoiceRepository;
import vn.edu.nuce.daotao.StoreManager.respository.DistributorRespository;
import vn.edu.nuce.daotao.StoreManager.respository.StaffRespository;
import vn.edu.nuce.daotao.StoreManager.service.*;
import vn.edu.nuce.daotao.StoreManager.transfomer.ReceiptTransformer;

/**
 *
 * @author Anh
 */
@Service
public class ReceiptServiceImpl implements ReceiptService {

    @Autowired
    private ReceiptRespository receiptRespository;

    @Autowired
    private ReceiptTransformer receiptTransfomer;

    @Autowired
    private StaffRespository staffRespository;

    @Autowired
    private DistributorRespository distributorRespository;

    @Autowired
    private DetailInvoiceRepository detailInvoiceRepository;

    @Override
    public List<ReceiptResponse> getAllReceiptResponses() {
        return receiptRespository
                .findAll()
                .stream()
                .map(receiptTransfomer::transformToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public List<Object[]> getAllReceiptResponseObjects() {
        return receiptRespository
                .findAll()
                .stream()
                .map(Receipt -> receiptTransfomer.transform(Receipt))
                .collect(Collectors.toList());
    }

    @Override
    public boolean updateReceipt(int statusBtn, ReceiptResponse response) {
        int checkBtn = statusBtn;
        List<Distributor> distributors = distributorRespository.findAll();
        List<Staff> staffs = staffRespository.findAll();
        Receipt Receipt = receiptTransfomer.transformToEntity(response, staffs, distributors);
        switch (checkBtn) {
            case 2:
            case 3:
                receiptRespository.save(Receipt);
                return true;
            case 4:
                receiptRespository.delete(Receipt);
                return true;
        }
        return false;
    }

    @Override
    public boolean deleteReceipt(ReceiptResponse response) {
        List<Distributor> distributors = distributorRespository.findAll();
        List<Staff> staffs = staffRespository.findAll();
        Receipt receipt = receiptTransfomer.transformToEntity(response, staffs, distributors);
        boolean checkInCus = detailInvoiceRepository.findAll().stream().anyMatch(item -> item.getReceipt().getCodeReceipt() == receipt.getCodeReceipt());
        if (checkInCus) {
            return false;
        }
        receiptRespository.delete(receipt);
        return true;
    }
    
    @Override
    public Object[] getReceiptCreated() {
        return receiptRespository
                .findAll(new Sort(Sort.Direction.DESC, "date"))
                .stream()
                .map(bill -> receiptTransfomer.transform(bill))
                .findFirst().get();
    }

    @Override
    public ReceiptResponse getReceiptResponseById(String id) {
        return receiptRespository
                .findAll()
                .stream()
                .filter(item -> item.getCodeReceipt()== Integer.valueOf(id))
                .map(bill -> receiptTransfomer.transformToResponse(bill))
                .findFirst().get();
    }

}
