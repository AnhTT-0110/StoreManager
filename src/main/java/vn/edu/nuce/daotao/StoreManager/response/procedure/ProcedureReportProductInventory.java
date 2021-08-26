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
public class ProcedureReportProductInventory {

    private Integer productCode;
    private String productName;
    private BigDecimal price;
    private Integer quantity;
    private BigDecimal total;

    public ProcedureReportProductInventory(Object[] objects) {
        this.productCode = (Integer) objects[0];
        this.productName = (String) objects[1];
        this.price = (BigDecimal) objects[2];
        this.quantity = (Integer) objects[3];
        this.total = (BigDecimal) objects[4];
    }
}
