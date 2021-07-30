/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import vn.edu.nuce.daotao.StoreManager.controller.StaffController;
import vn.edu.nuce.daotao.StoreManager.response.StaffResponse;
import vn.edu.nuce.daotao.StoreManager.service.StaffService;

/**
 *
 * @author Anh
 */
@Controller
public class StaffControllerImp implements StaffController{

    @Autowired
    private StaffService staffService;
    
    @Override
    public List<StaffResponse> getAllStaffResponses() {
        return staffService.getAllStaffResponses();
    }

    @Override
    public List<Object[]> getAllStaffResponsesObject() {
         return staffService.getAllStaffResponseObjects();
    }
    
}
