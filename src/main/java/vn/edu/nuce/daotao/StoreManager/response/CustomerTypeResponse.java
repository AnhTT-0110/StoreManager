/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.response;

import java.util.Collection;
import lombok.Data;

/**
 *
 * @author Anh
 */
@Data
public class CustomerTypeResponse {
    
    private int codeCustomerType;
    private String nameCustomerType;
    private String description;
//    private Collection<CustomerResponse> customers;

    @Override
    public String toString() {
        return nameCustomerType;
    }
    
}
