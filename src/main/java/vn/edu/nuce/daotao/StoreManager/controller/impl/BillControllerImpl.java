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
import vn.edu.nuce.daotao.StoreManager.controller.BillController;
import vn.edu.nuce.daotao.StoreManager.response.BillResponse;
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureReportBill;
import vn.edu.nuce.daotao.StoreManager.service.BillService;
import vn.edu.nuce.daotao.StoreManager.validator.CodeSystem;
import vn.edu.nuce.daotao.StoreManager.validator.Validator;

/**
 *
 * @author Anh
 */
@Controller
@Log4j2
public class BillControllerImpl implements BillController {

    @Autowired
    private BillService billService;

    @Autowired
    Validator validator;

    @Override
    public List<Object[]> getAllBillResponsesObject() {
        return billService.getAllBillResponseObjects();
    }

    @Override
    public List<BillResponse> getAllBillResponses() {
        return null;
    }

    @Override
    public CodeSystem updateBill(int statusBtn, BillResponse response) {
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
        if (billService.updateBill(statusBtn, response)) {
            return CodeSystem.SUCCESS;
        }
        return CodeSystem.ERROR03;
    }

    @Override
    public CodeSystem deleteBillaa(BillResponse response) {
        if (billService.deleteBill(response)) {
            return CodeSystem.SUCCESS;
        }
        return CodeSystem.ERROR08;
    }

    @Override
    public Object[] getBillCreated() {
        return billService.getBillCreated();
    }

    @Override
    public BillResponse getBillResponseById(String id) {
        return billService.getBillResponseById(id);
    }

    @Override
    public List<ProcedureReportBill> getReportBill(String billCode, String nameCus, String nameStaff, String startDate, String endDate) {
        return billService.getReportBill(billCode, nameCus, nameStaff, startDate, endDate);
    }

    @Override
    public String getReportBillQtty(String billCode, String nameCus, String nameStaff, String startDate, String endDate) {
        return billService.getReportBillQtty(billCode, nameCus, nameStaff, startDate, endDate);

    }

    @Override
    public String getReportBillSum(String billCode, String nameCus, String nameStaff, String startDate, String endDate) {
        return billService.getReportBillSum(billCode, nameCus, nameStaff, startDate, endDate);

    }

    @Override
    public List<Object[]> getReportBillObject(String billCode, String nameCus, String nameStaff, String startDate, String endDate) {
       return billService.getReportBillObject(billCode, nameCus, nameStaff, startDate, endDate);
    }

}
