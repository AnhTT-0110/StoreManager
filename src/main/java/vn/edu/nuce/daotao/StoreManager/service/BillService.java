/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service;

import java.util.List;
import vn.edu.nuce.daotao.StoreManager.response.BillResponse;
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureReportBill;

/**
 *
 * @author Anh
 */
public interface BillService {

    List<BillResponse> getAllBillResponses();

    List<Object[]> getAllBillResponseObjects();

    boolean updateBill(int statusBtn, BillResponse response);

    boolean deleteBill(BillResponse response);

    Object[] getBillCreated();

    BillResponse getBillResponseById(String id);

    List<ProcedureReportBill> getReportBill(String billCode, String nameCus, String nameStaff, String startDate, String endDate);

    List<Object[]> getReportBillObject(String billCode, String nameCus, String nameStaff, String startDate, String endDate);

    String getReportBillQtty(String billCode, String nameCus, String nameStaff, String startDate, String endDate);

    String getReportBillSum(String billCode, String nameCus, String nameStaff, String startDate, String endDate);

}
