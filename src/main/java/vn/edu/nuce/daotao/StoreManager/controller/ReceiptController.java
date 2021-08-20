/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.controller;

import java.util.List;
import vn.edu.nuce.daotao.StoreManager.response.ReceiptResponse;
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureReportBill;
import vn.edu.nuce.daotao.StoreManager.validator.CodeSystem;

/**
 *
 * @author Anh
 */
public interface ReceiptController {

    List<Object[]> getAllReceiptResponsesObject();

    List<ReceiptResponse> getAllReceiptResponses();

    CodeSystem updateReceipt(int statusBtn, ReceiptResponse response);

    CodeSystem deleteReceiptaa(ReceiptResponse response);

    Object[] getReceiptCreated();

    ReceiptResponse getReceiptResponseById(String id);

    List<ProcedureReportBill> getReportReceipt(String ReceiptCode, String nameCus, String nameStaff, String startDate, String endDate);

    String getReportReceiptQtty(String ReceiptCode, String nameCus, String nameStaff, String startDate, String endDate);

    String getReportReceiptSum(String ReceiptCode, String nameCus, String nameStaff, String startDate, String endDate);

    List<Object[]> getReportReceiptObject(String ReceiptCode, String nameCus, String nameStaff, String startDate, String endDate);

}
