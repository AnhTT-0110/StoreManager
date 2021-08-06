/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.transfomer;

import java.util.List;
import org.springframework.stereotype.Component;
import vn.edu.nuce.daotao.StoreManager.model.Receipt;
import vn.edu.nuce.daotao.StoreManager.model.DetailInvoice;
import vn.edu.nuce.daotao.StoreManager.model.Product;
import vn.edu.nuce.daotao.StoreManager.model.Receipt;
import vn.edu.nuce.daotao.StoreManager.response.DetailInvoiceResponse;

/**
 *
 * @author Anh
 */
@Component
public class DetailInvoiceTransformer {

    public Object[] transform(DetailInvoice detailInvoice) {
        Object[] item = new Object[9];
        item[1] = detailInvoice.getCodeDetailInvoice();
        item[2] = detailInvoice.getReceipt().getCodeReceipt();
        item[3] = detailInvoice.getProduct().getCodeProduct();
        item[4] = detailInvoice.getProduct().getNameProduct();
        item[5] = detailInvoice.getProduct().getQuantity();
        item[6] = detailInvoice.getQuantity();
        item[7] = detailInvoice.getQuantity();
        item[8] = detailInvoice.getTotalDcash();
        item[9] = detailInvoice.getDescription();
        return item;
    }

    public DetailInvoice transformToEntity(DetailInvoiceResponse response, List<Receipt> receipts, List<Product> products) {
        DetailInvoice detailInvoice = new DetailInvoice();
        detailInvoice.setCodeDetailInvoice(response.getCodeDetailInvoice().isEmpty() ? Integer.valueOf(0) : Integer.valueOf(response.getCodeDetailInvoice()));
        detailInvoice.setQuantity(Integer.valueOf(response.getQuantity()));
        detailInvoice.setDescription(response.getDescription());
        receipts
                .stream()
                .filter(receipt -> receipt.getCodeReceipt() == (Integer.valueOf(response.getReceiptCode())))
                .findAny()
                .ifPresent(item -> detailInvoice.setReceipt(item));
        products
                .stream()
                .filter(product -> product.getCodeProduct() == Integer.valueOf(response.getProductCode()))
                .findAny()
                .ifPresent(item -> detailInvoice.setProduct(item));
        detailInvoice.setPrice(detailInvoice.getProduct().getPrice());
        detailInvoice.setPrice(Double.valueOf(response.getPrice()));
        detailInvoice.setTotalDcash(detailInvoice.getPrice() * detailInvoice.getQuantity());
        return detailInvoice;
    }
}
