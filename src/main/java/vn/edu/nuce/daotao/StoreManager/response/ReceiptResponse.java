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
public class ReceiptResponse {

    private String codeReceipt;
    private String codeStaff;
    private String nameStaff;
    private String codeDistributor;
    private String nameDistributor;
    private String totalDcash;
    private String date;
    private String description;

    public ReceiptResponse() {
    }

    public ReceiptResponse(String codeReceipt, String codeStaff, String codeDistributor, String date, String totalDcash, String description) {
        this.codeReceipt = codeReceipt;
        this.codeStaff = codeStaff;
        this.codeDistributor = codeDistributor;
        this.totalDcash = totalDcash;
        this.date = date;
        this.description = description;
    }

}
