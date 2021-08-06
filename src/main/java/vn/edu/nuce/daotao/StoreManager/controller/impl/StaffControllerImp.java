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
import vn.edu.nuce.daotao.StoreManager.controller.StaffController;
import vn.edu.nuce.daotao.StoreManager.response.StaffResponse;
import vn.edu.nuce.daotao.StoreManager.service.StaffService;
import vn.edu.nuce.daotao.StoreManager.validator.CodeSystem;
import vn.edu.nuce.daotao.StoreManager.validator.Validator;

/**
 *
 * @author Anh
 */
@Controller
@Log4j2
public class StaffControllerImp implements StaffController {

    @Autowired
    private StaffService staffService;

    @Autowired
    Validator validator;

    @Override
    public List<StaffResponse> getAllStaffResponses() {
        return staffService.getAllStaffResponses();
    }

    @Override
    public List<Object[]> getAllStaffResponsesObject() {
        return staffService.getAllStaffResponseObjects();
    }

    @Override
    public CodeSystem updateStaff(int statusBtn, StaffResponse response) {
        CodeSystem codeSystem = validator.validateRegexAndAllArgumentNotNull(response.getAddress(),
                response.getBirthday(), response.getDateStart(),
                response.getNamePosition(), response.getNameStaff(),
                response.getPhoneNumber(), response.getSex());
        if (!CodeSystem.SUCCESS02.equals(codeSystem)) {
            return codeSystem;
        }
        if (!Validator.isDateValid(response.getBirthday()) || !Validator.isDateValid(response.getDateStart())) {
            log.error("Input date wrong format");
            return CodeSystem.ERROR01;
        }
        staffService.updateStaff(statusBtn, response);
        return CodeSystem.SUCCESS;
    }

    @Override
    public CodeSystem deleteStaff(StaffResponse staffResponse) {
         if (staffService.deleteStaff(staffResponse))
             return CodeSystem.SUCCESS;
        return CodeSystem.ERROR19;
    }

}
