/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service;

import java.util.List;
import vn.edu.nuce.daotao.StoreManager.response.ReceiptResponse;

/**
 *
 * @author Anh
 */
public interface ReceiptService {

    List<ReceiptResponse> getAllReceiptResponses();

    List<Object[]> getAllReceiptResponseObjects();

    boolean updateReceipt(int statusBtn, ReceiptResponse response);

    boolean deleteReceipt(ReceiptResponse response);
    
}
