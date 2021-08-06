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
public class ProductTypeResponse {

    private String codeProductType;
    private String nameProductType;
    private String description;

    public ProductTypeResponse() {
    }

    public ProductTypeResponse(String codeProductType, String nameProductType, String description) {
        this.codeProductType = codeProductType;
        this.nameProductType = nameProductType;
        this.description = description;
    }
    
}
