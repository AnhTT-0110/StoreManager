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
    
}
