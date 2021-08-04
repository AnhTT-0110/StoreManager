/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.controller;

import java.util.List;
import vn.edu.nuce.daotao.StoreManager.response.ProductResponse;
import vn.edu.nuce.daotao.StoreManager.validator.CodeSystem;

/**
 *
 * @author Anh
 */
public interface ProductController {

    List<Object[]> getAllProductResponsesObject();

    List<ProductResponse> getAllProductResponses();
    
    ProductResponse getProductResponseById(String codeProduct);

    CodeSystem updateProduct(int statusBtn, ProductResponse response);

    CodeSystem deleteProduct(ProductResponse response);
}
