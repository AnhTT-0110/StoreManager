/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.nuce.daotao.StoreManager.model.Distributor;
import vn.edu.nuce.daotao.StoreManager.response.DistributorResponse;
import vn.edu.nuce.daotao.StoreManager.respository.DistributorRespository;
import vn.edu.nuce.daotao.StoreManager.respository.ReceiptRespository;
import vn.edu.nuce.daotao.StoreManager.service.*;
import vn.edu.nuce.daotao.StoreManager.transfomer.DistributorTransformer;

/**
 *
 * @author Anh
 */
@Service
public class DistributorServiceImpl implements DistributorService {

    @Autowired
    private DistributorRespository distributorRespository;

    @Autowired
    private DistributorTransformer distributorTransformer;

    @Autowired
    private ReceiptRespository receiptRespository;

    @Override
    public List<Object[]> getAllDistributorObject() {
        List<Object[]> objects = new ArrayList<>();
        List<Distributor> distributors = distributorRespository.findAll();
        distributors.forEach((distributor) -> {
            objects.add(distributorTransformer.transform(distributor));
        });
        return objects;
    }

    @Override
    public boolean updateDistributor(int statusBtn, DistributorResponse customerResponse) {
        int checkBtn = statusBtn;
        Distributor distributor = distributorTransformer.transformToEntity(customerResponse);
        switch (checkBtn) {
            case 2:
            case 3:
                distributorRespository.save(distributor);
                return true;
            case 4:
                distributorRespository.delete(distributor);
                return true;
        }
        return false;
    }

    @Override
    public boolean deleteDistributor(DistributorResponse customerResponse) {
        Distributor distributor = distributorTransformer.transformToEntity(customerResponse);
        if (receiptRespository.findAll().stream().anyMatch(item -> item.getDistributor().getCodeDistributor() == distributor.getCodeDistributor())) {
            return false;
        }
        distributorRespository.delete(distributor);
        return true;
    }

    @Override
    public List<DistributorResponse> getAllDistributorResponseEntity() {
        return distributorRespository
                .findAll()
                .stream()
                .map(bill -> distributorTransformer.transformToResponse(bill))
                .collect(Collectors.toList());   
    }

}
