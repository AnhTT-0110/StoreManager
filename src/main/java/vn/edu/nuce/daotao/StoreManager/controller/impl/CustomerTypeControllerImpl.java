/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.edu.nuce.daotao.StoreManager.controller.CustomerTypeController;
import vn.edu.nuce.daotao.StoreManager.response.CustomerTypeResponse;
import vn.edu.nuce.daotao.StoreManager.service.CustomerTypeService;

/**
 *
 * @author Anh
 */
@Component
public class CustomerTypeControllerImpl implements CustomerTypeController{

    @Autowired
    private CustomerTypeService customerTypeService;
    
    @Override
    public List<CustomerTypeResponse> getAllCustomerType() {
        return customerTypeService.getAllCustomerType();
    }
    
}
