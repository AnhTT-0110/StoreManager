/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service.impl;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import vn.edu.nuce.daotao.StoreManager.model.BillDetail;
import vn.edu.nuce.daotao.StoreManager.model.DetailInvoice;
import vn.edu.nuce.daotao.StoreManager.model.Product;
import vn.edu.nuce.daotao.StoreManager.model.ProductType;
import vn.edu.nuce.daotao.StoreManager.response.ProductResponse;
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureReportBill;
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureReportProduct;
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureReportProductInventory;
import vn.edu.nuce.daotao.StoreManager.respository.BillDetailRespository;
import vn.edu.nuce.daotao.StoreManager.respository.DetailInvoiceRepository;
import vn.edu.nuce.daotao.StoreManager.respository.ProductRespository;
import vn.edu.nuce.daotao.StoreManager.respository.ProductTypeRespository;
import vn.edu.nuce.daotao.StoreManager.service.*;
import vn.edu.nuce.daotao.StoreManager.transfomer.ProductTransformer;

/*
 *
 * @author Anh
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRespository productRespository;

    @Autowired
    private ProductTransformer productTransformer;

    @Autowired
    private ProductTypeRespository productTypeRespository;

    @Autowired
    private BillDetailRespository billDetailRespository;

    @Autowired
    private DetailInvoiceRepository detailInvoiceRepository;

    @Override
    public List<Object[]> getAllProductResponseObjects() {
        return productRespository
                .findAll()
                .stream()
                .map(product -> productTransformer.transformToObject(product))
                .collect(Collectors.toList());
    }

    @Override
    public boolean updateProduct(int statusBtn, ProductResponse productResponse) {
        int checkBtn = statusBtn;
        List<ProductType> productTypes = productTypeRespository.findAll();
        Product Product = productTransformer.transformToEntity(productResponse, productTypes);
        switch (checkBtn) {
            case 2:
            case 3:
                productRespository.save(Product);
                return true;
            case 4:
                productRespository.delete(Product);
                return true;
        }
        return false;
    }

    @Override
    public boolean deleteProduct(ProductResponse productResponse) {
        List<ProductType> productTypes = productTypeRespository.findAll();
        List<BillDetail> billDetails = billDetailRespository.findAll();
        List<DetailInvoice> detailInvoices = detailInvoiceRepository.findAll();
        boolean checkBillDetails = billDetails.stream().anyMatch(item -> item.getProduct().getCodeProduct() == Integer.valueOf(productResponse.getCodeProduct()));
        boolean checkDetailInvoice = detailInvoices.stream().anyMatch(item -> item.getProduct().getCodeProduct() == Integer.valueOf(productResponse.getCodeProduct()));
        if (checkDetailInvoice || checkBillDetails) {
            return false;
        }
        Product Product = productTransformer.transformToEntity(productResponse, productTypes);
        productRespository.delete(Product);
        return true;
    }

    @Override
    public List<ProductResponse> getAllProductResponse() {
        return productRespository
                .findAll()
                .stream()
                .map(product -> productTransformer.transform(product))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<ProductResponse> getProductResponse(String codeProduct) {
        return productRespository
                .findAll()
                .stream()
                .filter(product -> product.getCodeProduct() == Integer.valueOf(codeProduct))
                .map(product -> productTransformer.transform(product))
                .findFirst();
    }

    @Override
    public List<ProcedureReportProduct> getReportProduct(String startDate, String endDate) {
        List<Object> objects = null;
        if (StringUtils.isEmpty(startDate) && StringUtils.isEmpty(endDate)) {
            startDate = "2021-01-01";
            objects = productRespository.getProducts(Date.valueOf(startDate), Date.valueOf(LocalDate.now()));
        } else {
            objects = productRespository.getProducts(Date.valueOf(startDate), Date.valueOf(endDate));
        }
        List<ProcedureReportProduct> earnByTimes = new ArrayList<>();
        for (int i = 0; i < objects.size(); i++) {
            earnByTimes.add(new ProcedureReportProduct((Object[]) objects.get(i)));
        }
        return earnByTimes;
    }

    @Override
    public List<ProcedureReportProductInventory> getReportProductInventory(String startDate, String endDate) {
        List<Object> objects = null;
        if (StringUtils.isEmpty(startDate) && StringUtils.isEmpty(endDate)) {
            startDate = "2021-01-01";
            objects = productRespository.getProductsInventory(Date.valueOf(startDate), Date.valueOf(LocalDate.now()));
        } else {
            objects = productRespository.getProductsInventory(Date.valueOf(startDate), Date.valueOf(endDate));
        }
        List<ProcedureReportProductInventory> earnByTimes = new ArrayList<>();
        for (int i = 0; i < objects.size(); i++) {
            earnByTimes.add(new ProcedureReportProductInventory((Object[]) objects.get(i)));
        }
        return earnByTimes;
    }

    @Override
    public List<Object[]> getReportProductObject(String startDate, String endDate) {
        List<Object> objects = null;
        if (StringUtils.isEmpty(startDate) && StringUtils.isEmpty(endDate)) {
            startDate = "2021-01-01";
            objects = productRespository.getProducts(Date.valueOf(startDate), Date.valueOf(LocalDate.now()));
        } else {
            objects = productRespository.getProducts(Date.valueOf(startDate), Date.valueOf(endDate));
        }
        List<Object[]> earnByTimes = new ArrayList<>();
        for (int i = 0; i < objects.size(); i++) {
            earnByTimes.add((Object[]) objects.get(i));
        }
        return earnByTimes;
    }

    @Override
    public List<Object[]> getReportProductInventoryObject(String startDate, String endDate) {
        List<Object> objects = null;
        if (StringUtils.isEmpty(startDate) && StringUtils.isEmpty(endDate)) {
            startDate = "2021-01-01";
            objects = productRespository.getProductsInventory(Date.valueOf(startDate), Date.valueOf(LocalDate.now()));
        } else {
            objects = productRespository.getProductsInventory(Date.valueOf(startDate), Date.valueOf(endDate));
        }
        List<Object[]> earnByTimes = new ArrayList<>();
        for (int i = 0; i < objects.size(); i++) {
            earnByTimes.add((Object[]) objects.get(i));
        }
        return earnByTimes;
    }

}
