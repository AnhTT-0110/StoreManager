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
public class ProductResponse {
    
    private String codeProduct;
    private String nameProduct;
    private String codeProductType;
    private String nameProductType;
    private String priceInput;
    private String price;
    private String quantity;
    private String status;
    private String image;
    private String description;

    public ProductResponse() {
    }

    public ProductResponse(String codeProduct, String nameProduct, String codeProductType, String priceInput, String price, String quantity, String status, String image, String description) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.codeProductType = codeProductType;
        this.priceInput = priceInput;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
        this.image = image;
        this.description = description;
    }
    
    
}
