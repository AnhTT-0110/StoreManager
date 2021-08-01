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
import vn.edu.nuce.daotao.StoreManager.controller.DistributorController;
import vn.edu.nuce.daotao.StoreManager.response.DistributorResponse;
import vn.edu.nuce.daotao.StoreManager.service.DistributorService;
import vn.edu.nuce.daotao.StoreManager.validator.CodeSystem;
import vn.edu.nuce.daotao.StoreManager.validator.Validator;

/**
 *
 * @author Anh
 */
@Controller
@Log4j2
public class DistributorControllerImpl implements DistributorController {

    @Autowired
    private DistributorService distributorService;

    @Autowired
    Validator validator;

    @Override
    public List<Object[]> getAllDistributorResponseObject() {
        return distributorService.getAllDistributorObject();
    }

    @Override
    public CodeSystem updateDistributor(int statusBtn, DistributorResponse response) {
        CodeSystem codeSystem = validator.validateRegexAndAllArgumentNotNull(response.getNameDistributor(), response.getAddress(), response.getEmail(), response.getPhoneNumber());
        if (!CodeSystem.SUCCESS02.equals(codeSystem)) {
            return codeSystem;
        }
        if (distributorService.updateDistributor(statusBtn, response)) {
            return CodeSystem.SUCCESS;
        }
        return CodeSystem.ERROR04;
    }

    @Override
    public CodeSystem deletDistributor(DistributorResponse distributorResponse) {
        if (distributorService.deleteDistributor(distributorResponse))
             return CodeSystem.SUCCESS;
        return CodeSystem.ERROR07;
    }

}
