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

    private String codeDistributor;
    private String codeStaff;
    private double totalDcash;
    private String date;
    private String description;

    public ReceiptResponse(String codeDistributor, String codeStaff, double totalDcash, String date, String description) {
        this.codeDistributor = codeDistributor;
        this.codeStaff = codeStaff;
        this.totalDcash = totalDcash;
        this.date = date;
        this.description = description;
    }

    public ReceiptResponse() {
    }
    
    
    
}
