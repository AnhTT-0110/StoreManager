/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service;

import java.util.List;
import java.util.Optional;
import vn.edu.nuce.daotao.StoreManager.response.ProductResponse;
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureReportProduct;
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureReportProductInventory;

/*
 *
 * @author Anh
 */
public interface ProductService {

    List<Object[]> getAllProductResponseObjects();

    List<ProductResponse> getAllProductResponse();

    boolean updateProduct(int statusBtn, ProductResponse productResponse);

    boolean deleteProduct(ProductResponse productResponse);

    Optional<ProductResponse> getProductResponse(String codeProduct);

    List<ProcedureReportProduct> getReportProduct(String startDate, String endDate);

    List<ProcedureReportProductInventory> getReportProductInventory(String startDate, String endDate);

    List<Object[]> getReportProductObject(String startDate, String endDate);
    
     List<Object[]> getReportProductInventoryObject(String startDate, String endDate);

}
