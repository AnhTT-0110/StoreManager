/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.nuce.daotao.StoreManager.model.Receipt;
import vn.edu.nuce.daotao.StoreManager.model.DetailInvoice;
import vn.edu.nuce.daotao.StoreManager.model.Product;
import vn.edu.nuce.daotao.StoreManager.response.DetailInvoiceResponse;
import vn.edu.nuce.daotao.StoreManager.respository.ReceiptRespository;
import vn.edu.nuce.daotao.StoreManager.respository.DetailInvoiceRepository;
import vn.edu.nuce.daotao.StoreManager.respository.ProductRespository;
import vn.edu.nuce.daotao.StoreManager.service.*;
import vn.edu.nuce.daotao.StoreManager.transfomer.DetailInvoiceTransformer;

/*
 *
 * @author Anh
 */
@Service
public class DetailInvoiceServiceImpl implements DetailInvoiceService {

    @Autowired
    private DetailInvoiceRepository detailInvoiceRespository;

    @Autowired
    private DetailInvoiceTransformer detailInvoiceTransformer;

    @Autowired
    private ProductRespository productRespository;

    @Autowired
    private ReceiptRespository receiptRespository;

    @Override
    public List<Object[]> getAllDetailInvoiceResponseObjects() {
        return detailInvoiceRespository
                .findAll()
                .stream()
                .map(DetailInvoice -> detailInvoiceTransformer.transform(DetailInvoice))
                .collect(Collectors.toList());
    }

    @Override
    public boolean updateDetailInvoice(int statusBtn, DetailInvoiceResponse DetailInvoiceResponse) {
        int checkBtn = statusBtn;
        List<Product> products = productRespository.findAll();
        List<Receipt> receipts = receiptRespository.findAll();
        DetailInvoice detailInvoice = detailInvoiceTransformer.transformToEntity(DetailInvoiceResponse, receipts, products);
        switch (checkBtn) {
            case 2:
            case 3:
                detailInvoiceRespository.save(detailInvoice);
                return true;
            case 4:
                detailInvoiceRespository.delete(detailInvoice);
                return true;
        }
        return false;
    }

    @Override
    public boolean deleteDetailInvoice(DetailInvoiceResponse DetailInvoiceResponse) {
        List<Product> products = productRespository.findAll();
        List<Receipt> receipts = receiptRespository.findAll();
        DetailInvoice detailInvoice = detailInvoiceTransformer.transformToEntity(DetailInvoiceResponse, receipts, products);
        detailInvoiceRespository.delete(detailInvoice);
        return true;
    }

    @Override
    public List<Object[]> getAllDetailInvoiceResponseObjectsByReceipt(String codeReceipt) {
        return detailInvoiceRespository
                .findAll()
                .stream()
                .filter(item -> item.getReceipt().getCodeReceipt() == Integer.valueOf(codeReceipt))
                .map(DetailInvoice -> detailInvoiceTransformer.transform(DetailInvoice))
                .collect(Collectors.toList());
    }
}
