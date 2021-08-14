/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.model.outputproc;

import java.math.BigDecimal;
import javax.persistence.Id;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author Anh
 */
@Data
@ToString
public class doanhthutheothang {

    @Id
    private Integer month;
    private BigDecimal amount;

    public doanhthutheothang(Object[] objects) {
        this.month = (Integer) objects[0];
        this.amount = (BigDecimal) objects[1];
    } 
    
    
}
