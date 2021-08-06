/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service;

import java.util.List;
import vn.edu.nuce.daotao.StoreManager.response.DetailInvoiceResponse;

/*
 *
 * @author Anh
 */
public interface DetailInvoiceService {

    List<Object[]> getAllDetailInvoiceResponseObjects();
    
    List<Object[]> getAllDetailInvoiceResponseObjectsByReceipt(String codeReceipt);

    boolean updateDetailInvoice(int statusBtn, DetailInvoiceResponse detailInvoiceResponse);

    boolean deleteDetailInvoice(DetailInvoiceResponse detailInvoiceResponse);
}
