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
public class ProcedureResponseEarnByTime {
    private Integer month;
    private Integer year;
    private BigDecimal amount;
    
    public ProcedureResponseEarnByTime(Object[] objects) {
        this.month = (Integer) objects[0];
        this.year = (Integer) objects[1];
        this.amount = (BigDecimal) objects[2];
    } 
}
