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
import vn.edu.nuce.daotao.StoreManager.controller.ProductTypeController;
import vn.edu.nuce.daotao.StoreManager.response.ProductTypeResponse;
import vn.edu.nuce.daotao.StoreManager.service.ProductTypeService;
import vn.edu.nuce.daotao.StoreManager.validator.CodeSystem;
import vn.edu.nuce.daotao.StoreManager.validator.Validator;

/**
 *
 * @author Anh
 */
@Controller
@Log4j2
public class ProductTypeControllerImpl implements ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    @Autowired
    Validator validator;

    @Override
    public List<Object[]> getAllProductTypeResponsesObject() {
        return productTypeService.getAllProductTypeResponseObjects();
    }

    @Override
    public CodeSystem updateProductType(int statusBtn, ProductTypeResponse response) {
        CodeSystem codeSystem = validator.validateRegexAndAllArgumentNotNull(response.getCodeProductType(),response.getNameProductType());
        if (!CodeSystem.SUCCESS02.equals(codeSystem)) {
            return codeSystem;
        }
        if (productTypeService.updateProductType(statusBtn, response)) {
            return CodeSystem.SUCCESS;
        }
        return CodeSystem.ERROR03;
    }

    @Override
    public CodeSystem deleteProductType(ProductTypeResponse response) {
        if (productTypeService.deleteProductType(response))
             return CodeSystem.SUCCESS;
        return CodeSystem.ERROR13;
    }

    @Override
    public List<ProductTypeResponse> getAllProductTypeResponses() {
        return productTypeService.getAllProductTypeResponse();
    }

    @Override
    public ProductTypeResponse getProductTypeResponseById(String productTypeCode) {
        return !productTypeService.getProductTypeResponse(productTypeCode).isPresent() ? null : productTypeService.getProductTypeResponse(productTypeCode).get();
    }
}
