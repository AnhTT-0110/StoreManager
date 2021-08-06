/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.controller.impl;

import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import vn.edu.nuce.daotao.StoreManager.controller.DetailInvoiceController;
import vn.edu.nuce.daotao.StoreManager.response.DetailInvoiceResponse;
import vn.edu.nuce.daotao.StoreManager.service.DetailInvoiceService;
import vn.edu.nuce.daotao.StoreManager.validator.CodeSystem;
import vn.edu.nuce.daotao.StoreManager.validator.Validator;

/**
 *
 * @author Anh
 */
@Controller
@Log4j2
public class DetailInvoiceControllerImpl implements DetailInvoiceController {

    @Autowired
    private DetailInvoiceService detailInvoiceService;

    @Autowired
    Validator validator;

    @Override
    public List<Object[]> getAllDetailInvoiceResponsesObject() {
        return detailInvoiceService.getAllDetailInvoiceResponseObjects();
    }

    @Override
    public CodeSystem updateDetailInvoice(int statusBtn, DetailInvoiceResponse response) {
        CodeSystem codeSystem = validator.validateRegexAndAllArgumentNotNull(response.getQuantity(), response.getProductCode(),
                response.getReceiptCode());
        if (!CodeSystem.SUCCESS02.equals(codeSystem)) {
            return codeSystem;
        }
        if (detailInvoiceService.updateDetailInvoice(statusBtn, response)) {
            return CodeSystem.SUCCESS;
        }
        return CodeSystem.ERROR03;
    }

    @Override
    public CodeSystem deleteDetailInvoice(DetailInvoiceResponse response) {
        if (detailInvoiceService.deleteDetailInvoice(response))
             return CodeSystem.SUCCESS;
        return CodeSystem.ERROR16;
    }

    @Override
    public List<Object[]> getAllDetailInvoiceResponseObjectsByReceipt(String Receipt) {
        return detailInvoiceService.getAllDetailInvoiceResponseObjectsByReceipt(Receipt);
    }

}
