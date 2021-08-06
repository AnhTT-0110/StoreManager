/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.transfomer;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import vn.edu.nuce.daotao.StoreManager.model.Distributor;
import vn.edu.nuce.daotao.StoreManager.response.DistributorResponse;

/**
 *
 * @author Anh
 */
@Component
@Log4j2
public class DistributorTransformer {

    public Object[] transform(Distributor distributor) {
        Object[] item = new Object[7];
        item[1] = distributor.getCodeDistributor();
        item[2] = distributor.getNameDistributor();
        item[3] = distributor.getAddress();
        item[4] = distributor.getPhoneNumber();
        item[5] = distributor.getEmail();
        item[6] = distributor.getDescription();
        return item;
    }

    public Distributor transformToEntity(DistributorResponse response) {
        Distributor distributor = new Distributor();
        distributor.setCodeDistributor(response.getCodeDistributor());
        distributor.setNameDistributor(response.getNameDistributor());
        distributor.setAddress(response.getAddress());
        distributor.setPhoneNumber(response.getPhoneNumber());
        distributor.setEmail(response.getEmail());
        distributor.setDescription(response.getDescription());
        return distributor;
    }
    
    public DistributorResponse transformToResponse(Distributor distributor) {
        DistributorResponse response = new DistributorResponse();
        response.setCodeDistributor(distributor.getCodeDistributor());
        response.setNameDistributor(distributor.getNameDistributor());
        response.setAddress(distributor.getAddress());
        response.setPhoneNumber(distributor.getPhoneNumber());
        response.setEmail(distributor.getEmail());
        response.setDescription(distributor.getDescription());
        return response;
    }

}
