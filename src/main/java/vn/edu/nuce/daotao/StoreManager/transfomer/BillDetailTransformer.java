/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.transfomer;

import java.util.List;
import org.springframework.stereotype.Component;
import vn.edu.nuce.daotao.StoreManager.model.Account;
import vn.edu.nuce.daotao.StoreManager.model.Bill;
import vn.edu.nuce.daotao.StoreManager.model.BillDetail;
import vn.edu.nuce.daotao.StoreManager.model.Product;
import vn.edu.nuce.daotao.StoreManager.response.AccountResponse;
import vn.edu.nuce.daotao.StoreManager.response.BillDetailResponse;

/**
 *
 * @author Anh
 */
@Component
public class BillDetailTransformer {
    
    public Object[] transform(BillDetail billDetail) {
        Object[] item = new Object[8];
        item[1] = billDetail.getCodeBillDetail();
        item[2] = billDetail.getBill().getCodeBill();
        item[3] = billDetail.getProduct().getCodeProduct();
        item[4] = billDetail.getProduct().getNameProduct();
        item[5] = billDetail.getQuantity();
        item[6] = billDetail.getTotalCash();
        item[7] = billDetail.getDescription();
        return item;
    }

    public BillDetail transformToEntity(BillDetailResponse response, List<Bill> bills, List<Product> products) {
        BillDetail billDetail = new BillDetail();
        billDetail.setCodeBillDetail(Integer.valueOf(response.getCodeBillDetail()));
        billDetail.setQuantity(Integer.valueOf(response.getQuantity()));
        billDetail.setTotalCash(Integer.valueOf(response.getTotalCash()));
        billDetail.setDescription(response.getDescription());
        bills
                .stream()
                .filter(bill -> bill.getCodeBill()== (Integer.valueOf(response.getBillCode())))
                .findAny()
                .ifPresent(item -> billDetail.setBill(item));
        products
                .stream()
                .filter(product -> product.getCodeProduct() == Integer.valueOf(response.getProductCode()))
                .findAny()
                .ifPresent(item -> billDetail.setProduct(item));
        return billDetail;
    }
}
