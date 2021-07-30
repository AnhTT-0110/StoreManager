/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.nuce.daotao.StoreManager.response.PositionResponse;
import vn.edu.nuce.daotao.StoreManager.respository.PositionRespository;
import vn.edu.nuce.daotao.StoreManager.service.*;
import vn.edu.nuce.daotao.StoreManager.transfomer.PositionTransformer;

/**
 *
 * @author Anh
 */
@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionRespository positionRespository;
    
    @Autowired
    private PositionTransformer positionTransformer;
    
    @Override
    public List<PositionResponse> getAllPositionResponses() {
        return positionRespository.findAll()
                .stream()
                .map(positionTransformer::transform)
                .collect(Collectors.toList());
    }

}
