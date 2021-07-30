/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.validator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.stereotype.Component;

/**
 *
 * @author Anh
 */
@Component
public class Validator {

    final static String DATE_FORMAT = "yyyy-MM-dd";

    public static boolean isDateValid(String date) {
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    
    public CodeSystem validateRegexAndAllArgumentNotNull(String... args) {
        for (String arg : args) {
            if(!regexParamFilter(arg))
                return CodeSystem.ERROR02;
        }
        return CodeSystem.SUCCESS02;
    }
    
    static boolean regexParamFilter(String param) {
        return param != null && !param.isEmpty();
    }

}
