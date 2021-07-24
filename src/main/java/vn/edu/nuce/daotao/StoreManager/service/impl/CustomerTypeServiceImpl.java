/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import vn.edu.nuce.daotao.StoreManager.respository.CustomerTypeRespository;
import vn.edu.nuce.daotao.StoreManager.service.*;

/**
 *
 * @author Anh
 */

public class CustomerTypeServiceImpl implements CustomerTypeService{
    
    @Autowired
    private CustomerTypeRespository customerTypeRespository;
}
