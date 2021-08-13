/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.response.procedure;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Anh
 */
public class ProcedureResponseBigDecimal {

    private String value;

    public ProcedureResponseBigDecimal(BigDecimal value) {
        this.value = String.valueOf(value);
    }

    public ProcedureResponseBigDecimal() {
    }

    public String getValueConcurrent() {
        return currencyWithChosenLocalisation(Double.valueOf(value), new Locale("vi", "VN"));
    }
    
     public String getValueInteger() {
        return withLargeIntegers(Double.valueOf(value));
    }

    public static String currencyWithChosenLocalisation(double value, Locale locale) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return nf.format(value);
    }
    
    public static String withLargeIntegers(double value) {
    DecimalFormat df = new DecimalFormat("###,###,###");
    return df.format(value);
}

}
