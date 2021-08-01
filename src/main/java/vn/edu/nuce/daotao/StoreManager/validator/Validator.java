/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.validator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Component;

/**
 *
 * @author Anh
 */
@Component
public class Validator {

    final static String DATE_FORMAT = "yyyy-MM-dd";
    Pattern patternUser = Pattern.compile("^[a-z0-9._-]{4,15}$");
    Pattern patternPassword = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{8,16})");
    private DateTimeFormatter dateFormatter = DateTimeFormatter.BASIC_ISO_DATE;
    private static final String FORMAT_DATE = "yyyy-MM-dd'T'HH:mm:ss";

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
            if (!regexParamFilter(arg)) {
                return CodeSystem.ERROR02;
            }
        }
        return CodeSystem.SUCCESS02;
    }

    static boolean regexParamFilter(String param) {
        return param != null && !param.isEmpty();
    }

    public CodeSystem validateUser(final String user) {
        if (patternUser.matcher(user).matches()) {
            return CodeSystem.SUCCESS03;
        }
        return CodeSystem.ERROR05;
    }

    public CodeSystem validatePassword(final String pass) {
        if (patternPassword.matcher(pass).matches()) {
            return CodeSystem.SUCCESS03;
        }
        return CodeSystem.ERROR06;

    }
    
     public CodeSystem isValidLocalDateTime(String dateStr) {
        try {
            LocalDateTime.parse(dateStr, DateTimeFormatter.ofPattern(FORMAT_DATE));
        } catch (DateTimeParseException e) {
            return CodeSystem.ERROR09;
        }
        return CodeSystem.SUCCESS03;
    }
     
     public CodeSystem validateNumber(String number){
            try  {
                if (Double.parseDouble(number) >=0) {
                     return CodeSystem.SUCCESS03; 
                }
                 
               return CodeSystem.ERROR10;
            } catch(NumberFormatException exception)
            {
                return CodeSystem.ERROR10;
            }
     }
     
}
