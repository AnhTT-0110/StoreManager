/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service;

import java.util.List;
import java.util.Optional;
import vn.edu.nuce.daotao.StoreManager.response.ProductTypeResponse;

/*
 *
 * @author Anh
 */
public interface ProductTypeService {

    List<Object[]> getAllProductTypeResponseObjects();
    
    List<ProductTypeResponse> getAllProductTypeResponse();

    boolean updateProductType(int statusBtn, ProductTypeResponse productTypeResponse);

    boolean deleteProductType(ProductTypeResponse productTypeResponse);
    
    Optional<ProductTypeResponse> getProductTypeResponse(String codeProductType);
}
