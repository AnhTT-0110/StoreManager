/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.controller;

import java.util.List;
import vn.edu.nuce.daotao.StoreManager.response.ProductTypeResponse;
import vn.edu.nuce.daotao.StoreManager.validator.CodeSystem;

/**
 *
 * @author Anh
 */
public interface ProductTypeController {

    List<Object[]> getAllProductTypeResponsesObject();

    List<ProductTypeResponse> getAllProductTypeResponses();
    
    ProductTypeResponse getProductTypeResponseById(String codeProductType);

    CodeSystem updateProductType(int statusBtn, ProductTypeResponse response);

    CodeSystem deleteProductType(ProductTypeResponse response);
}
