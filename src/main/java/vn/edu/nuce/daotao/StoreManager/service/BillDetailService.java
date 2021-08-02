/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service;

import java.util.List;
import vn.edu.nuce.daotao.StoreManager.response.BillDetailResponse;

/*
 *
 * @author Anh
 */
public interface BillDetailService {

    List<Object[]> getAllBillDetailResponseObjects();
    
    List<Object[]> getAllBillDetailResponseObjectsByBill(String codeBill);

    boolean updateBillDetail(int statusBtn, BillDetailResponse BillDetailResponse);

    boolean deleteBillDetail(BillDetailResponse BillDetailResponse);
}
