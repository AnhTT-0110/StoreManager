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
public class BillResponse {
    
    private String codeBill;
    private String customerCode;
    private String customerName;
    private String staffCode;
    private String staffName;
    private String date;
    private String totalDcash;
    private String description;    

    public BillResponse() {
    }

    public BillResponse(String codeBill, String customerCode, String customerName, String staffCode, String staffName, String date, String totalDcash, String description) {
        this.codeBill = codeBill;
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.staffCode = staffCode;
        this.staffName = staffName;
        this.date = date;
        this.totalDcash = totalDcash;
        this.description = description;
    }

    public BillResponse(String codeBill, String customerCode, String staffCode, String date, String totalDcash, String description) {
        this.codeBill = codeBill;
        this.customerCode = customerCode;
        this.staffCode = staffCode;
        this.date = date;
        this.totalDcash = totalDcash;
        this.description = description;
    }
     
}
