/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Anh
 */
@Entity
@Data
@Table(name = "loaisanpham")
public class ProductType implements Serializable {
    
    @Id
    @Column(name = "MaLoaiSanPham")
    private int codeProductType;
    
    @Column(name = "TenLoaiSanPham")
    private String nameProductType;
    
    @OneToMany(mappedBy = "productType")
    private Collection<Product> products;
}
