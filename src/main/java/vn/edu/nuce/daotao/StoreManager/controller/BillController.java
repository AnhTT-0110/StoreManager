/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.controller;

import java.util.List;
import vn.edu.nuce.daotao.StoreManager.response.BillResponse;
import vn.edu.nuce.daotao.StoreManager.validator.CodeSystem;

/**
 *
 * @author Anh
 */
public interface BillController {

    List<Object[]> getAllBillResponsesObject();

    List<BillResponse> getAllBillResponses();

    CodeSystem updateBill(int statusBtn, BillResponse response);

    CodeSystem deleteBillaa(BillResponse response);
}
