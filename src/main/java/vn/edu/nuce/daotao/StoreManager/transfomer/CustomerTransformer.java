/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.transfomer;

import java.sql.Date;
import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import vn.edu.nuce.daotao.StoreManager.model.Customer;
import vn.edu.nuce.daotao.StoreManager.model.CustomerType;
import vn.edu.nuce.daotao.StoreManager.response.CustomerResponse;

/**
 *
 * @author Anh
 */
@Component
@Log4j2
public class CustomerTransformer {

    public Object[] transform(Customer customer) {
        Object[] item = new Object[9];
        item[1] = customer.getCodeCustomer();
        item[2] = customer.getNameCustomer();
        item[3] = customer.getBirthday();
        item[4] = customer.getSex() == 0 ? "Nam" : "Nữ";
        item[5] = customer.getAddress();
        item[6] = customer.getPhoneNumber();
        item[7] = customer.getCustomerType().getNameCustomerType();
        item[8] = customer.getDescription();
        return item;
    }

    public Customer transformToEntity(CustomerResponse customerResponse, List<CustomerType> customerTypes) {
        Customer customer = new Customer();
        customer.setCodeCustomer(customerResponse.getCodeCustomer());
        customer.setNameCustomer(customerResponse.getNameCustomer());
        customer.setAddress(customerResponse.getAddress());
        customer.setBirthday(Date.valueOf(customerResponse.getBirthday()));
        customer.setSex(customerResponse.getSex().equals("Nam") ? 1 : 0);
        customer.setPhoneNumber(customerResponse.getPhoneNumber());
        customer.setDescription(customerResponse.getDescription());
        customerTypes
                .stream()
                .filter(type -> type.getNameCustomerType().equals(customerResponse.getNameCustomerType()))
                .findAny()
                .ifPresent(item -> customer.setCustomerType(item));
        return customer;
    }

    public CustomerResponse transformToEntity(Customer customer) {
        CustomerResponse response = new CustomerResponse();
        response.setCodeCustomer(customer.getCodeCustomer());
        response.setNameCustomer(customer.getNameCustomer());
        response.setBirthday(customer.getBirthday().toString());
        response.setSex(customer.getSex() == 0 ? "Nam" : "Nữ");
        response.setAddress(customer.getAddress());
        response.setPhoneNumber(customer.getPhoneNumber());
        response.setNameCustomerType(customer.getCustomerType().getNameCustomerType());
        response.setDescription(customer.getDescription());
        return response;
    }

}
