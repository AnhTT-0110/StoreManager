/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.transfomer;

import org.springframework.stereotype.Component;
import vn.edu.nuce.daotao.StoreManager.model.Position;
import vn.edu.nuce.daotao.StoreManager.response.PositionResponse;

/**
 *
 * @author Anh
 */
@Component
public class PositionTransformer {
    
     public PositionResponse transform(Position position) {
        PositionResponse response = new PositionResponse();
        response.setCodePosition(position.getCodePosition());
        response.setNamePosition(position.getNamePosition());
        response.setDescription(position.getDescription());
        return response;
    }
     
     public Position transformToEntity(PositionResponse positionResponse) {
        Position position = new Position();
        position.setCodePosition(positionResponse.getCodePosition());
        position.setNamePosition(positionResponse.getNamePosition());
        position.setDescription(positionResponse.getDescription());
        return position;
    }
     
     public Object[] transformToObject(Position position) {
        Object[] response = new Object[4];
        response[1] = position.getCodePosition();
        response[2] = position.getNamePosition();
        response[3] = position.getDescription();
        return response;
    }
     
    
}
