/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.transfomer;

import java.util.List;
import java.util.Objects;
import javax.swing.ImageIcon;
import org.springframework.stereotype.Component;
import vn.edu.nuce.daotao.StoreManager.model.Product;
import vn.edu.nuce.daotao.StoreManager.model.ProductType;
import vn.edu.nuce.daotao.StoreManager.response.ProductResponse;

/**
 *
 * @author Anh
 */
@Component
public class ProductTransformer {
    
    public Object[] transformToObject(Product product) {
        Object[] item = new Object[11];
        item[1] = product.getCodeProduct();
        item[2] = product.getNameProduct();
        item[3] = product.getProductType().getCodeProductType();
        item[4] = product.getProductType().getNameProductType();
        item[5] = product.getPriceInput();
        item[6] = product.getPrice();
        item[7] = product.getQuantity();
        String image = product.getImage();
        item[8] = Objects.isNull(image) ? "" : product.getImage();
        item[9] = product.getDescription();
        if (!Objects.isNull(image)) {
            image = image.replaceAll("/", "\\");
            item[10] = new ImageIcon(image);
        }
        return item;
    }
    
    public Product transformToEntity(ProductResponse response, List<ProductType> productTypes) {
        Product product = new Product();
        product.setCodeProduct(Integer.valueOf(response.getCodeProduct()));
        product.setNameProduct(response.getNameProduct());
        product.setPriceInput(Double.valueOf(response.getPriceInput()));
        product.setPrice(Double.valueOf(response.getPrice()));
        product.setQuantity(Integer.valueOf(response.getQuantity()));
        product.setImage(response.getImage());
        product.setDescription(response.getDescription());
        productTypes
                .stream()
                .filter(productType -> productType.getCodeProductType() == (Integer.valueOf(response.getCodeProductType())))
                .findAny()
                .ifPresent(item -> product.setProductType(item));
        return product;
    }
    
    public ProductResponse transform(Product product) {
        ProductResponse response = new ProductResponse();
        response.setCodeProduct(String.valueOf(product.getCodeProduct()));
        response.setNameProduct(product.getNameProduct());
        response.setPriceInput(String.valueOf(product.getPriceInput()));
        response.setPrice(String.format("%,.2f",product.getPrice()));
        response.setQuantity(String.valueOf(product.getQuantity()));
        response.setImage(product.getImage());
        response.setDescription(product.getDescription());
        response.setCodeProductType(String.valueOf(product.getProductType().getCodeProductType()));
        response.setNameProductType(product.getProductType().getNameProductType());
        return response;
    }
}
