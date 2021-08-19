/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.response.procedure;

import java.math.BigDecimal;
import java.sql.Timestamp;
import lombok.Data;

/**
 *
 * @author Anh
 */
@Data
public class ProcedureReportBill {

    private Integer billCode;
    private Integer customerCode;
    private String customerName;
    private Timestamp date;
    private BigDecimal amount;
    private String staffName;
    private String description;

    public ProcedureReportBill(Object[] objects) {
        this.billCode = (Integer) objects[0];
        this.customerCode = (Integer) objects[1];
        this.customerName = (String) objects[2];
        this.date = (Timestamp) objects[3];
        this.amount = (BigDecimal) objects[4];
        this.staffName = (String) objects[5];
        this.description = (String) objects[6];
    }
    
    
}
