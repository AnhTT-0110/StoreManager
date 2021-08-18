/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.response;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Anh
 */
@Data
public class DetailInvoiceResponse implements Serializable {

    private String codeDetailInvoice;
    private String receiptCode;
    private String productCode;
    private String productName;
    private String quantity;
    private String price;
    private String totalDcash;
    private String description;

    public DetailInvoiceResponse() {
    }

    public DetailInvoiceResponse(String codeDetailInvoice, String receiptCode, String productCode, String quantity,String totalDcash, String description) {
        this.codeDetailInvoice = codeDetailInvoice;
        this.receiptCode = receiptCode;
        this.productCode = productCode;
        this.quantity = quantity;
        this.totalDcash = totalDcash;
        this.description = description;
    }
    
    public DetailInvoiceResponse(String codeDetailInvoice, String receiptCode, String productCode, String quantity,String price, String totalDcash, String description) {
        this.codeDetailInvoice = codeDetailInvoice;
        this.receiptCode = receiptCode;
        this.productCode = productCode;
        this.quantity = quantity;
        this.price = price;
        this.totalDcash = totalDcash;
        this.description = description;
    }
    
}
