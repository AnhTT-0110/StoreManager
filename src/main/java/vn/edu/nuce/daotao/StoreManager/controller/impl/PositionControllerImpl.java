/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import vn.edu.nuce.daotao.StoreManager.controller.PositionController;
import vn.edu.nuce.daotao.StoreManager.response.PositionResponse;
import vn.edu.nuce.daotao.StoreManager.service.PositionService;
import vn.edu.nuce.daotao.StoreManager.validator.CodeSystem;
import vn.edu.nuce.daotao.StoreManager.validator.Validator;

/**
 *
 * @author Anh
 */
@Controller
public class PositionControllerImpl implements PositionController {

    @Autowired
    private PositionService positionService;

    @Override
    public List<PositionResponse> getAllPositionResponses() {
        return positionService.getAllPositionResponses();
    }

    @Autowired
    Validator validator;

    @Override
    public CodeSystem updatePositon(int statusBtn, PositionResponse response) {
        CodeSystem codeSystem = validator.validateRegexAndAllArgumentNotNull(response.getNamePosition());
        if (!CodeSystem.SUCCESS02.equals(codeSystem)) {
            return codeSystem;
        }
        positionService.updatePosition(statusBtn, response);
        return CodeSystem.SUCCESS;
    }

    @Override
    public boolean deletePosition(PositionResponse positionResponse) {
        return positionService.deletePosition(positionResponse);
    }

    @Override
    public List<Object[]> getAllPositionResponseObject() {
      return positionService.getAllPositionResponseObject();
    }

}
