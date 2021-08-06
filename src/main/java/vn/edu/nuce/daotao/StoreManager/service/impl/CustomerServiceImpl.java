/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.edu.nuce.daotao.StoreManager.model.Customer;
import vn.edu.nuce.daotao.StoreManager.model.CustomerType;
import vn.edu.nuce.daotao.StoreManager.response.CustomerResponse;
import vn.edu.nuce.daotao.StoreManager.respository.BillRespository;
import vn.edu.nuce.daotao.StoreManager.respository.CustomerRespository;
import vn.edu.nuce.daotao.StoreManager.respository.CustomerTypeRespository;
import vn.edu.nuce.daotao.StoreManager.service.*;
import vn.edu.nuce.daotao.StoreManager.transfomer.CustomerTransformer;

/**
 *
 * @author Anh
 */
@Component
@Log4j2
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRespository customerRespository;

    @Autowired
    private CustomerTypeRespository customerTypeRespository;
    
    @Autowired
    private BillRespository billRespository;

    @Autowired
    private CustomerTransformer customerTransformer;

    @Override
    public List<Object[]> getAllCustomerResponse() {
        List<Object[]> objects = new ArrayList<>();
        List<Customer> customers = customerRespository.findAll();
        customers.forEach((customer) -> {
            objects.add(customerTransformer.transform(customer));
        });
        return objects;
    }

    @Override
    public boolean updateCustomer(int statusBtn, CustomerResponse customerResponse) {
        int checkBtn = statusBtn;
        List<CustomerType> customerTypes = customerTypeRespository.findAll();
        Customer customer = customerTransformer.transformToEntity(customerResponse, customerTypes);
        log.info("customer" + customer);
        switch (checkBtn) {
            case 2:
            case 3:
                customerRespository.save(customer);
                return true;
            case 4:
                customerRespository.delete(customer);
                return true;
        }
        return false;
    }

    @Override
    public boolean deleteCustomer(CustomerResponse customerResponse) {
        List<CustomerType> customerTypes = customerTypeRespository.findAll();
        boolean checkInCus = billRespository.findAll().stream().anyMatch(item -> item.getCustomer().getCodeCustomer() == customerResponse.getCodeCustomer());
        if (checkInCus) {
            return false;
        }
        Customer customer = customerTransformer.transformToEntity(customerResponse, customerTypes);
        customerRespository.delete(customer);
        return true;
    }

    @Override
    public List<CustomerResponse> getAllCustomerResponseEntity() {
        return customerRespository
                .findAll()
                .stream()
                .map(customerTransformer::transformToEntity)
                .collect(Collectors.toList());
    }

}
