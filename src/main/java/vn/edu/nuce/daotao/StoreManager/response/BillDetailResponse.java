/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.response;

import lombok.Data;

/**
 *
 * @author Anh
 */
@Data
public class BillDetailResponse {

    private String codeBillDetail;
    private String billCode;
    private String productCode;
    private String productName;
    private String quantity;
    private String totalCash;
    private String description;
    private String price;

    public BillDetailResponse(String codeBillDetail, String billCode, String productCode, String productName, String quantity, String totalCash, String description, String price) {
        this.codeBillDetail = codeBillDetail;
        this.billCode = billCode;
        this.productCode = productCode;
        this.productName = productName;
        this.quantity = quantity;
        this.totalCash = totalCash;
        this.description = description;
        this.price = price;
    }

    public BillDetailResponse(String codeBillDetail, String billCode, String productCode, String quantity, String totalCash, String description) {
        this.codeBillDetail = codeBillDetail;
        this.billCode = billCode;
        this.productCode = productCode;
        this.quantity = quantity;
        this.totalCash = totalCash;
        this.description = description;
    }

    public BillDetailResponse() {
    }

}
