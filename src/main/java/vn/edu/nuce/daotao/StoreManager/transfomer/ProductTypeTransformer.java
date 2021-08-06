/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.transfomer;

import org.springframework.stereotype.Component;
import vn.edu.nuce.daotao.StoreManager.model.ProductType;
import vn.edu.nuce.daotao.StoreManager.response.ProductTypeResponse;

/**
 *
 * @author Anh
 */
@Component
public class ProductTypeTransformer {
    
    public Object[] transformToObject(ProductType productType) {
        Object[] item = new Object[4];
        item[1] = productType.getCodeProductType();
        item[2] = productType.getNameProductType();
        item[3] = productType.getDescription();
        return item;
    }
    
    public ProductType transformToEntity(ProductTypeResponse response) {
        ProductType productType = new ProductType();
        productType.setCodeProductType(Integer.valueOf(response.getCodeProductType()));
        productType.setNameProductType(response.getNameProductType());
        productType.setDescription(response.getDescription());
        return productType;
    }
    
    public ProductTypeResponse transform(ProductType productType) {
       ProductTypeResponse typeResponse = new ProductTypeResponse();
        typeResponse.setCodeProductType(String.valueOf(productType.getCodeProductType()));
        typeResponse.setNameProductType(productType.getNameProductType());
        typeResponse.setDescription(productType.getDescription());
        return typeResponse;
    }
}
