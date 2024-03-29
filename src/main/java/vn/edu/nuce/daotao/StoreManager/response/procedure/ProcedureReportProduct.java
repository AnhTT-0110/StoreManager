/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.response.procedure;

import java.math.BigDecimal;
import lombok.Data;

/**
 *
 * @author Anh
 */
@Data
public class ProcedureReportProduct {

    private Integer productCode;
    private String productName;
    private BigDecimal quantity;
    private BigDecimal total;

    public ProcedureReportProduct(Object[] objects) {
        this.productCode = (Integer) objects[0];
        this.productName = (String) objects[1];
        this.quantity = (BigDecimal) objects[2];
        this.total = (BigDecimal) objects[3];
    }
}
