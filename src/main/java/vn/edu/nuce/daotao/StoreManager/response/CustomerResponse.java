/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.response;

import java.sql.Date;
import lombok.Data;

/**
 *
 * @author Anh
 */
@Data
public class CustomerResponse {
    
    private int codeCustomer;
    private String nameCustomer;
    private String birthday;
    private String sex;
    private String address;
    private String phoneNumber;
    private String nameCustomerType;
    private String description;

    public CustomerResponse(int codeCustomer, String nameCustomer, String birthday, String sex, String address, String phoneNumber, String codeCustomerType, String description) {
        this.codeCustomer = codeCustomer;
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.nameCustomerType = codeCustomerType;
        this.description = description;
    }

    public CustomerResponse() {
    }
    
    
}
