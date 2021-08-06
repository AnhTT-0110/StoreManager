/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.nuce.daotao.StoreManager.model.Product;
import vn.edu.nuce.daotao.StoreManager.model.ProductType;
import vn.edu.nuce.daotao.StoreManager.response.ProductTypeResponse;
import vn.edu.nuce.daotao.StoreManager.respository.ProductRespository;
import vn.edu.nuce.daotao.StoreManager.respository.ProductTypeRespository;
import vn.edu.nuce.daotao.StoreManager.service.*;
import vn.edu.nuce.daotao.StoreManager.transfomer.ProductTypeTransformer;

/*
 *
 * @author Anh
 */
@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private ProductTypeRespository productTypeRespository;

    @Autowired
    private ProductRespository productRespository;

    @Autowired
    private ProductTypeTransformer productTypeTransformer;

    @Override
    public List<Object[]> getAllProductTypeResponseObjects() {
        return productTypeRespository
                .findAll()
                .stream()
                .map(productType -> productTypeTransformer.transformToObject(productType))
                .collect(Collectors.toList());
    }

    @Override
    public boolean updateProductType(int statusBtn, ProductTypeResponse productTypeResponse) {
        int checkBtn = statusBtn;
        ProductType ProductType = productTypeTransformer.transformToEntity(productTypeResponse);
        switch (checkBtn) {
            case 2:
            case 3:
                productTypeRespository.save(ProductType);
                return true;
            case 4:
                productTypeRespository.delete(ProductType);
                return true;
        }
        return false;
    }

    @Override
    public boolean deleteProductType(ProductTypeResponse productTypeResponse) {
        List<Product> products = productRespository.findAll();
        boolean checkProduct = products.stream().anyMatch(item -> item.getProductType().getCodeProductType() == Integer.valueOf(productTypeResponse.getCodeProductType()));
        if (checkProduct) {
            return false;
        }
        ProductType ProductType = productTypeTransformer.transformToEntity(productTypeResponse);
        productTypeRespository.delete(ProductType);
        return true;
    }

    @Override
    public List<ProductTypeResponse> getAllProductTypeResponse() {
        return productTypeRespository
                .findAll()
                .stream()
                .map(productType -> productTypeTransformer.transform(productType))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<ProductTypeResponse> getProductTypeResponse(String codeProductType) {
        return productTypeRespository
                .findAll()
                .stream()
                .filter(productType -> productType.getCodeProductType() == Integer.valueOf(codeProductType))
                .map(productType -> productTypeTransformer.transform(productType))
                .findFirst();
    }

}
