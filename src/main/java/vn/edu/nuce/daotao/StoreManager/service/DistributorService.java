/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service;

import java.util.List;
import vn.edu.nuce.daotao.StoreManager.response.DistributorResponse;

/**
 *
 * @author Anh
 */
public interface DistributorService{
    
    List<Object[]> getAllDistributorObject();
    
    List<DistributorResponse> getAllDistributorResponseEntity();
    
    boolean updateDistributor(int statusBtn, DistributorResponse customer);
    
    boolean deleteDistributor(DistributorResponse customerResponse);
}
