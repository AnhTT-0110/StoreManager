/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.controller.impl;

import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.edu.nuce.daotao.StoreManager.controller.CustomerController;
import vn.edu.nuce.daotao.StoreManager.response.CustomerResponse;
import vn.edu.nuce.daotao.StoreManager.service.CustomerService;
import vn.edu.nuce.daotao.StoreManager.validator.CodeSystem;
import vn.edu.nuce.daotao.StoreManager.validator.Validator;

/**
 *
 * @author Anh
 */
@Component
@Log4j2
public class CustomerControllerImpl implements CustomerController {

    @Autowired
    CustomerService customerService;

    @Autowired
    Validator validator;

    @Override
    public List<Object[]> getAllCustomerResponseObject() {
        return customerService.getAllCustomerResponse();
    }

    @Override
    public CodeSystem updateCustomer(int statusBtn, CustomerResponse customerResponse) {
        CodeSystem codeSystem = validator.validateRegexAndAllArgumentNotNull(customerResponse.getNameCustomer(), customerResponse.getAddress(), customerResponse.getBirthday(), customerResponse.getPhoneNumber());
        if (!CodeSystem.SUCCESS02.equals(codeSystem)) {
            return codeSystem;
        }
        if (!Validator.isDateValid(customerResponse.getBirthday())) {
            log.error("Input date wrong format");
            return CodeSystem.ERROR01;
        }
        customerService.updateCustomer(statusBtn, customerResponse);
        return CodeSystem.SUCCESS;
    }

    @Override
    public CodeSystem deleteCustomer(CustomerResponse customerResponse) {
        if (customerService.deleteCustomer(customerResponse))
             return CodeSystem.SUCCESS;
        return CodeSystem.ERROR17;
    }

    @Override
    public List<CustomerResponse> getAllCustomerResponse() {
        return customerService.getAllCustomerResponseEntity();
    }

}
