
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import vn.edu.nuce.daotao.StoreManager.respository.BillRespository;
import vn.edu.nuce.daotao.StoreManager.service.*;

/**
 *
 * @author Anh
 */
public class BillServiceImpl implements BillService{
    
    @Autowired
    private BillRespository billRespository;
    
}
