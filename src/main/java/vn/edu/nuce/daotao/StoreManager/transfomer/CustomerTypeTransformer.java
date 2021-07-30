/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.transfomer;

import org.springframework.stereotype.Component;
import vn.edu.nuce.daotao.StoreManager.model.CustomerType;
import vn.edu.nuce.daotao.StoreManager.response.CustomerTypeResponse;

/**
 *
 * @author Anh
 */
@Component
public class CustomerTypeTransformer {
    
     public CustomerTypeResponse transform(CustomerType customerType) {
        CustomerTypeResponse response = new CustomerTypeResponse();
        response.setCodeCustomerType(customerType.getCodeCustomerType());
        response.setNameCustomerType(customerType.getNameCustomerType());
        response.setDescription(customerType.getDescription());
        return response;
    }
    
}
