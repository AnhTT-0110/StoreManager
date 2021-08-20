/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service;

import java.util.List;
import vn.edu.nuce.daotao.StoreManager.response.ReceiptResponse;
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureReportBill;

/**
 *
 * @author Anh
 */
public interface ReceiptService {

    List<ReceiptResponse> getAllReceiptResponses();

    List<Object[]> getAllReceiptResponseObjects();

    boolean updateReceipt(int statusBtn, ReceiptResponse response);

    boolean deleteReceipt(ReceiptResponse response);

    Object[] getReceiptCreated();

    ReceiptResponse getReceiptResponseById(String id);

    List<ProcedureReportBill> getReportReceipt(String ReceiptCode, String nameCus, String nameStaff, String startDate, String endDate);

    List<Object[]> getReportReceiptObject(String ReceiptCode, String nameCus, String nameStaff, String startDate, String endDate);

    String getReportReceiptQtty(String ReceiptCode, String nameCus, String nameStaff, String startDate, String endDate);

    String getReportReceiptSum(String ReceiptCode, String nameCus, String nameStaff, String startDate, String endDate);

    void writerReport(String ReceiptCode, String nameCus, String nameStaff, String startDate, String endDate);

}
