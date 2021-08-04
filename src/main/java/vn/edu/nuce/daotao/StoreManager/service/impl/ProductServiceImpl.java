/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.nuce.daotao.StoreManager.model.BillDetail;
import vn.edu.nuce.daotao.StoreManager.model.DetailInvoice;
import vn.edu.nuce.daotao.StoreManager.model.Product;
import vn.edu.nuce.daotao.StoreManager.model.ProductType;
import vn.edu.nuce.daotao.StoreManager.model.Publisher;
import vn.edu.nuce.daotao.StoreManager.response.ProductResponse;
import vn.edu.nuce.daotao.StoreManager.respository.BillDetailRespository;
import vn.edu.nuce.daotao.StoreManager.respository.DetailInvoiceRepository;
import vn.edu.nuce.daotao.StoreManager.respository.ProductRespository;
import vn.edu.nuce.daotao.StoreManager.respository.ProductTypeRespository;
import vn.edu.nuce.daotao.StoreManager.respository.PublisherRespository;
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
    private PublisherRespository publisherRespository;

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
        List<BillDetail> billDetails = billDetailRespository.findAll();
        List<DetailInvoice> detailInvoices = detailInvoiceRepository.findAll();
        List<ProductType> productTypes = productTypeRespository.findAll();
        List<Publisher> publishers = publisherRespository.findAll();
        Product Product = productTransformer.transformToEntity(productResponse, productTypes, publishers);
        switch (checkBtn) {
            case 2:
                boolean checkBillDetails = billDetails.stream().anyMatch(item -> item.getProduct().getCodeProduct() == Integer.valueOf(productResponse.getCodeProduct()));
                boolean checkDetailInvoice = detailInvoices.stream().anyMatch(item -> item.getCodeDetailInvoice() == Integer.valueOf(productResponse.getCodePublisher()));
                if (checkDetailInvoice || checkBillDetails) {
                    return false;
                }
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
        List<Publisher> publishers = publisherRespository.findAll();
        Product Product = productTransformer.transformToEntity(productResponse, productTypes, publishers);
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

}
