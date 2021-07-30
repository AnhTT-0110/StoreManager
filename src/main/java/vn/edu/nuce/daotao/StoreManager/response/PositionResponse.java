/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.response;

import lombok.Data;

/**
 *
 * @author Anh
 */
@Data
public class PositionResponse {
    
    private int codePosition;
    private String namePosition;
    private String description;

    public PositionResponse(int codePosition, String namePosition, String description) {
        this.codePosition = codePosition;
        this.namePosition = namePosition;
        this.description = description;
    }

    public PositionResponse() {
    }
}
