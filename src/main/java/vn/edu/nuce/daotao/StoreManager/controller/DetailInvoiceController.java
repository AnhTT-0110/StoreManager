/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.controller;

import java.util.List;
import vn.edu.nuce.daotao.StoreManager.response.DetailInvoiceResponse;
import vn.edu.nuce.daotao.StoreManager.validator.CodeSystem;

/**
 *
 * @author Anh
 */
public interface DetailInvoiceController {

    List<Object[]> getAllDetailInvoiceResponsesObject();

    List<Object[]> getAllDetailInvoiceResponseObjectsByReceipt(String receipt);

    CodeSystem updateDetailInvoice(int statusBtn, DetailInvoiceResponse response);

    CodeSystem deleteDetailInvoice(DetailInvoiceResponse response);
}
