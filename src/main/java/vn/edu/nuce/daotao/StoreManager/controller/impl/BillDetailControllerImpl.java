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
import vn.edu.nuce.daotao.StoreManager.controller.BillDetailController;
import vn.edu.nuce.daotao.StoreManager.response.BillDetailResponse;
import vn.edu.nuce.daotao.StoreManager.service.BillDetailService;
import vn.edu.nuce.daotao.StoreManager.validator.CodeSystem;
import vn.edu.nuce.daotao.StoreManager.validator.Validator;

/**
 *
 * @author Anh
 */
@Controller
@Log4j2
public class BillDetailControllerImpl implements BillDetailController {

    @Autowired
    private BillDetailService billDetailService;

    @Autowired
    Validator validator;

    @Override
    public List<Object[]> getAllBillDetailResponsesObject() {
        return billDetailService.getAllBillDetailResponseObjects();
    }

    @Override
    public CodeSystem updateBillDetail(int statusBtn, BillDetailResponse response) {
        CodeSystem codeSystem = validator.validateRegexAndAllArgumentNotNull(response.getQuantity(), response.getProductCode(),
                response.getBillCode());
        if (!CodeSystem.SUCCESS02.equals(codeSystem)) {
            return codeSystem;
        }
        if (billDetailService.updateBillDetail(statusBtn, response)) {
            return CodeSystem.SUCCESS;
        }
        return CodeSystem.ERROR03;
    }

    @Override
    public CodeSystem deleteBillDetail(BillDetailResponse response) {
        if (billDetailService.deleteBillDetail(response)) {
            return CodeSystem.SUCCESS;
        }
        return CodeSystem.ERROR11;
    }

    @Override
    public List<Object[]> getAllBillDetailResponseObjectsByBill(String bill) {
        return billDetailService.getAllBillDetailResponseObjectsByBill(bill);
    }

    @Override
    public List<BillDetailResponse> getAllBillDetailResponsesObjectForSell(String bill) {
        return billDetailService.getAllBillDetailResponsesObjectForSell(bill);
    }

}
