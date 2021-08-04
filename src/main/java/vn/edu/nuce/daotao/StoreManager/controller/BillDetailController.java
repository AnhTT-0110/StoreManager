/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.controller;

import java.util.List;
import vn.edu.nuce.daotao.StoreManager.response.BillDetailResponse;
import vn.edu.nuce.daotao.StoreManager.validator.CodeSystem;

/**
 *
 * @author Anh
 */
public interface BillDetailController {

    List<Object[]> getAllBillDetailResponsesObject();

    List<Object[]> getAllBillDetailResponseObjectsByBill(String bill);

    CodeSystem updateBillDetail(int statusBtn, BillDetailResponse response);

    CodeSystem deleteBillDetail(BillDetailResponse response);
}
