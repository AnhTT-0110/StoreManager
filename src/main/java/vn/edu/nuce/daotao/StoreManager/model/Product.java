/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.model;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Anh
 */

@Entity
@Data
@Table(name = "sanpham")
public class Product {
    
    @Id
    @Column(name = "MaSanPham")
    private int codeProduct;
    
    @Column(name = "TenSanPham")
    private String nameProduct;
    
    @Column(name = "GiaNhap")
    private double priceInput;
    
    @Column(name = "GiaBan")
    private double price;
    
    @Column(name = "TonKho")
    private int quantity;
    
    @Column(name = "Image")
    private String image;
    
    @Column(name = "ChuThich")
    private String description;
    
    @OneToMany(mappedBy = "product")
    private Collection<BillDetail> billDetails;
    
    @OneToMany(mappedBy = "product")
    private Collection<DetailInvoice> detailInvoices;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "LoaiSanPham", columnDefinition = "MaLoaiSanPham")
    private ProductType productType; 
}
