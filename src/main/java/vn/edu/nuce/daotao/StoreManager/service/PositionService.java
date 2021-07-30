/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service;

import java.util.List;
import vn.edu.nuce.daotao.StoreManager.response.PositionResponse;

/**
 *
 * @author Anh
 */
public interface PositionService {

    List<PositionResponse> getAllPositionResponses();
    
    List<Object[]> getAllPositionResponseObject();
    
    boolean updatePosition(int statusBtn, PositionResponse positionResponse);

    boolean deletePosition(PositionResponse positionResponse);
}
