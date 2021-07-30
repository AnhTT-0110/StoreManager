/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.edu.nuce.daotao.StoreManager.response.CustomerTypeResponse;
import vn.edu.nuce.daotao.StoreManager.respository.CustomerTypeRespository;
import vn.edu.nuce.daotao.StoreManager.service.*;
import vn.edu.nuce.daotao.StoreManager.transfomer.CustomerTypeTransformer;

/**
 *
 * @author Anh
 */
@Component
@Log4j2
public class CustomerTypeServiceImpl implements CustomerTypeService {

    @Autowired
    private CustomerTypeRespository customerTypeRespository;

    @Autowired
    private CustomerTypeTransformer customerTypeTransformer;

    @Override
    public List<CustomerTypeResponse> getAllCustomerType() {
        return customerTypeRespository.findAll()
                .stream()
                .map(customerTypeTransformer::transform)
                .collect(Collectors.toList());
    }
}
