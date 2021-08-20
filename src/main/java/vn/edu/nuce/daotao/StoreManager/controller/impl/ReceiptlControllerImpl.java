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
import vn.edu.nuce.daotao.StoreManager.controller.ReceiptController;
import vn.edu.nuce.daotao.StoreManager.response.ReceiptResponse;
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureReportBill;
import vn.edu.nuce.daotao.StoreManager.service.ReceiptService;
import vn.edu.nuce.daotao.StoreManager.validator.CodeSystem;
import vn.edu.nuce.daotao.StoreManager.validator.Validator;

/**
 *
 * @author Anh
 */
@Controller
@Log4j2
public class ReceiptlControllerImpl implements ReceiptController {

    @Autowired
    private ReceiptService receiptService;

    @Autowired
    Validator validator;

    @Override
    public List<Object[]> getAllReceiptResponsesObject() {
        return receiptService.getAllReceiptResponseObjects();
    }

    @Override
    public List<ReceiptResponse> getAllReceiptResponses() {
        return null;
    }

    @Override
    public CodeSystem updateReceipt(int statusBtn, ReceiptResponse response) {
        CodeSystem codeSystem = validator.validateRegexAndAllArgumentNotNull(response.getTotalDcash());
        if (!CodeSystem.SUCCESS02.equals(codeSystem)) {
            return codeSystem;
        }
        codeSystem = validator.isValidLocalDateTime(response.getDate());
        if (!CodeSystem.SUCCESS03.equals(codeSystem)) {
            return codeSystem;
        }
        codeSystem = validator.validateNumber(response.getTotalDcash());
        if (!CodeSystem.SUCCESS03.equals(codeSystem)) {
            return codeSystem;
        }
        if (receiptService.updateReceipt(statusBtn, response)) {
            return CodeSystem.SUCCESS;
        }
        return CodeSystem.ERROR03;
    }

    @Override
    public CodeSystem deleteReceiptaa(ReceiptResponse response) {
        if (receiptService.deleteReceipt(response)) {
            return CodeSystem.SUCCESS;
        }
        return CodeSystem.ERROR15;
    }

    @Override
    public Object[] getReceiptCreated() {
        return receiptService.getReceiptCreated();
    }

    @Override
    public ReceiptResponse getReceiptResponseById(String id) {
        return receiptService.getReceiptResponseById(id);
    }

    @Override
    public List<ProcedureReportBill> getReportReceipt(String ReceiptCode, String nameCus, String nameStaff, String startDate, String endDate) {
        return receiptService.getReportReceipt(ReceiptCode, nameCus, nameStaff, startDate, endDate);
    }

    @Override
    public String getReportReceiptQtty(String ReceiptCode, String nameCus, String nameStaff, String startDate, String endDate) {
        return receiptService.getReportReceiptQtty(ReceiptCode, nameCus, nameStaff, startDate, endDate);

    }

    @Override
    public String getReportReceiptSum(String ReceiptCode, String nameCus, String nameStaff, String startDate, String endDate) {
        return receiptService.getReportReceiptSum(ReceiptCode, nameCus, nameStaff, startDate, endDate);

    }

    @Override
    public List<Object[]> getReportReceiptObject(String ReceiptCode, String nameCus, String nameStaff, String startDate, String endDate) {
        return receiptService.getReportReceiptObject(ReceiptCode, nameCus, nameStaff, startDate, endDate);
    }
}
