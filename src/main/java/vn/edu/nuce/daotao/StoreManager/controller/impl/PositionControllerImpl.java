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

/**
 *
 * @author Anh
 */
@Controller
public class PositionControllerImpl implements PositionController{

    @Autowired
    private PositionService positionService;

    @Override
    public List<PositionResponse> getAllPositionResponses() {
        return positionService.getAllPositionResponses();
    }
    
}
