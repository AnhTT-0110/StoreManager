/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.response.procedure;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Anh
 */
public class ProcedureResponseBigInteger {

    private String value;

    public ProcedureResponseBigInteger(BigInteger value) {
        this.value = String.valueOf(value);
    }

    public ProcedureResponseBigInteger() {
    }
    
     public String getValueInteger() {
        return withLargeIntegers(Double.valueOf(value));
    }
    
    public static String withLargeIntegers(double value) {
    DecimalFormat df = new DecimalFormat("###,###,###");
    return df.format(value);
}

}
