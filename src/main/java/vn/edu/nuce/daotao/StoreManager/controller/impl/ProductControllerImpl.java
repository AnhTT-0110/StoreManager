/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.controller.impl;

import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import vn.edu.nuce.daotao.StoreManager.controller.ProductController;
import vn.edu.nuce.daotao.StoreManager.response.ProductResponse;
import vn.edu.nuce.daotao.StoreManager.service.ProductService;
import vn.edu.nuce.daotao.StoreManager.validator.CodeSystem;
import vn.edu.nuce.daotao.StoreManager.validator.Validator;

/**
 *
 * @author Anh
 */
@Controller
@Log4j2
public class ProductControllerImpl implements ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    Validator validator;

    @Override
    public List<Object[]> getAllProductResponsesObject() {
        return productService.getAllProductResponseObjects();
    }

    @Override
    public CodeSystem updateProduct(int statusBtn, ProductResponse response) {
        CodeSystem codeSystem = validator.validateRegexAndAllArgumentNotNull(response.getCodeProduct(),response.getNameProduct(),
                response.getCodeProductType(),response.getPrice(),response.getPriceInput());
        if (!CodeSystem.SUCCESS02.equals(codeSystem)) {
            return codeSystem;
        }
        if (productService.updateProduct(statusBtn, response)) {
            return CodeSystem.SUCCESS;
        }
        return CodeSystem.ERROR03;
    }

    @Override
    public CodeSystem deleteProduct(ProductResponse response) {
        if (productService.deleteProduct(response))
             return CodeSystem.SUCCESS;
        return CodeSystem.ERROR12;
    }

    @Override
    public List<ProductResponse> getAllProductResponses() {
        return productService.getAllProductResponse();
    }

    @Override
    public ProductResponse getProductResponseById(String productCode) {
        return !productService.getProductResponse(productCode).isPresent() ? null : productService.getProductResponse(productCode).get();
    }
}
