/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.nuce.daotao.StoreManager.model.Receipt;
import vn.edu.nuce.daotao.StoreManager.response.ReceiptResponse;
import vn.edu.nuce.daotao.StoreManager.respository.ReceiptRespository;
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
    private ReceiptTransformer receiptTransformer;

    @Override
    public List<Object[]> getAllReceiptObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Receipt> getAllReceiptEntity() {
        return receiptRespository.findAll();
    }

    @Override
    public boolean updateReceipt(int statusBtn, ReceiptResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteReceipt(ReceiptResponse receiptResponse) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


