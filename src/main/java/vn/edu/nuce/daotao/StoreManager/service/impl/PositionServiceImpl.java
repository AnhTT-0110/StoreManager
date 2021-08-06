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
import vn.edu.nuce.daotao.StoreManager.model.Position;
import vn.edu.nuce.daotao.StoreManager.response.PositionResponse;
import vn.edu.nuce.daotao.StoreManager.respository.PositionRespository;
import vn.edu.nuce.daotao.StoreManager.respository.StaffRespository;
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
    private StaffRespository staffRespository;

    @Autowired
    private PositionTransformer positionTransformer;

    @Override
    public List<PositionResponse> getAllPositionResponses() {
        return positionRespository.findAll()
                .stream()
                .map(positionTransformer::transform)
                .collect(Collectors.toList());
    }

    @Override
    public boolean updatePosition(int statusBtn, PositionResponse positionResponse) {
        int checkBtn = statusBtn;
        Position position = positionTransformer.transformToEntity(positionResponse);
        switch (checkBtn) {
            case 2:
            case 3:
                positionRespository.save(position);
                return true;
            case 4:
                positionRespository.delete(position);
                return true;
        }
        return false;
    }

    @Override
    public boolean deletePosition(PositionResponse positionResponse) {
        Position position = positionTransformer.transformToEntity(positionResponse);
        boolean checkInStaff = staffRespository.findAll().stream().anyMatch(item -> item.getPosition().getCodePosition() == Integer.valueOf(positionResponse.getCodePosition()));
        if (checkInStaff) {
            return false;
        }
        positionRespository.delete(position);
        return true;
    }

    @Override
    public List<Object[]> getAllPositionResponseObject() {
        return positionRespository.findAll()
                .stream()
                .map(positionTransformer::transformToObject)
                .collect(Collectors.toList());
    }

}
