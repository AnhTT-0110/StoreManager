/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.transfomer;

import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import vn.edu.nuce.daotao.StoreManager.model.Bill;
import vn.edu.nuce.daotao.StoreManager.model.BillDetail;
import vn.edu.nuce.daotao.StoreManager.model.Product;
import vn.edu.nuce.daotao.StoreManager.response.BillDetailResponse;

/**
 *
 * @author Anh
 */
@Component
@Log4j2
public class BillDetailTransformer {

    public Object[] transform(BillDetail billDetail) {
        Object[] item = new Object[9];
        item[1] = billDetail.getCodeBillDetail();
        item[2] = billDetail.getBill().getCodeBill();
        item[3] = billDetail.getProduct().getCodeProduct();
        item[4] = billDetail.getProduct().getNameProduct();
        item[5] = billDetail.getQuantity();
        item[6] = String.format("%,.0f",billDetail.getPrice());
        item[7] = String.format("%,.0f",billDetail.getTotalCash());
        item[8] = billDetail.getDescription();
        return item;
    }

    public BillDetailResponse transformForSell(BillDetail billDetail) {
        BillDetailResponse item = new BillDetailResponse();
        item.setCodeBillDetail(String.valueOf(billDetail.getCodeBillDetail()));
       item.setProductCode(String.valueOf(billDetail.getProduct().getCodeProduct()));
        item.setProductName(billDetail.getProduct().getNameProduct());
        item.setImage(billDetail.getProduct().getImage());
        item.setQuantity(String.valueOf(billDetail.getQuantity()));
        item.setPrice(String.valueOf(billDetail.getPrice()));
        item.setTotalCash(String.valueOf(billDetail.getTotalCash()));
        item.setDescription(billDetail.getDescription());
        return item;
    }

    public BillDetail transformToEntity(BillDetailResponse response, List<Bill> bills, List<Product> products) {
        BillDetail billDetail = new BillDetail();
        billDetail.setCodeBillDetail(response.getCodeBillDetail().isEmpty() ? Integer.valueOf(0) : Integer.valueOf(response.getCodeBillDetail()));
        billDetail.setQuantity(Integer.valueOf(response.getQuantity()));
        billDetail.setDescription(response.getDescription());
        bills
                .stream()
                .filter(bill -> bill.getCodeBill() == (Integer.valueOf(response.getBillCode())))
                .findAny()
                .ifPresent(item -> billDetail.setBill(item));
        products
                .stream()
                .filter(product -> product.getCodeProduct() == Integer.valueOf(response.getProductCode()))
                .findAny()
                .ifPresent(item -> billDetail.setProduct(item));
        billDetail.setPrice(billDetail.getProduct().getPrice());
        billDetail.setTotalCash(billDetail.getPrice() * billDetail.getQuantity());

        return billDetail;
    }
}
