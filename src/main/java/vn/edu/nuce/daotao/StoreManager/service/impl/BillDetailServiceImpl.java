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
import vn.edu.nuce.daotao.StoreManager.model.Bill;
import vn.edu.nuce.daotao.StoreManager.model.BillDetail;
import vn.edu.nuce.daotao.StoreManager.model.Product;
import vn.edu.nuce.daotao.StoreManager.response.BillDetailResponse;
import vn.edu.nuce.daotao.StoreManager.respository.BillDetailRespository;
import vn.edu.nuce.daotao.StoreManager.respository.BillRespository;
import vn.edu.nuce.daotao.StoreManager.respository.ProductRespository;
import vn.edu.nuce.daotao.StoreManager.service.*;
import vn.edu.nuce.daotao.StoreManager.transfomer.BillDetailTransformer;

/*
 *
 * @author Anh
 */
@Service
public class BillDetailServiceImpl implements BillDetailService {

    @Autowired
    private BillDetailRespository billDetailRespository;

    @Autowired
    private BillDetailTransformer billDetailTransformer;

    @Autowired
    private ProductRespository productRespository;

    @Autowired
    private BillRespository billRespository;

    @Override
    public List<Object[]> getAllBillDetailResponseObjects() {
        return billDetailRespository
                .findAll()
                .stream()
                .map(BillDetail -> billDetailTransformer.transform(BillDetail))
                .collect(Collectors.toList());
    }

    @Override
    public boolean updateBillDetail(int statusBtn, BillDetailResponse billDetailResponse) {
        int checkBtn = statusBtn;
        List<Product> products = productRespository.findAll();
        List<Bill> bills = billRespository.findAll();
        BillDetail billDetail = billDetailTransformer.transformToEntity(billDetailResponse, bills, products);
        switch (checkBtn) {
            case 2:
            case 3:
                billDetailRespository.save(billDetail);
                return true;
            case 4:
                billDetailRespository.delete(billDetail);
                return true;
        }
        return false;
    }

    @Override
    public boolean deleteBillDetail(BillDetailResponse billDetailResponse) {
        List<Product> products = productRespository.findAll();
        List<Bill> bills = billRespository.findAll();
        BillDetail billDetail = billDetailTransformer.transformToEntity(billDetailResponse, bills, products);
        billDetailRespository.delete(billDetail);
        return true;
    }

    @Override
    public List<Object[]> getAllBillDetailResponseObjectsByBill(String codeBill) {
        return billDetailRespository
                .findAll()
                .stream()
                .filter(item -> item.getBill().getCodeBill() == Integer.valueOf(codeBill))
                .map(BillDetail -> billDetailTransformer.transform(BillDetail))
                .collect(Collectors.toList());
    }

    @Override
    public  List<BillDetailResponse> getAllBillDetailResponsesObjectForSell(String codeBill) {
         return billDetailRespository
                .findAll()
                .stream()
                .filter(item -> item.getBill().getCodeBill() == Integer.valueOf(codeBill))
                .map(BillDetail -> billDetailTransformer.transformForSell(BillDetail))
                .collect(Collectors.toList());
    }
}
