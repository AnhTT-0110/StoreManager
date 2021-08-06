/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Anh
 */
@Entity
@Data
@Table(name = "chitietphieunhap")
public class DetailInvoice implements Serializable{
  
    @Id
    @Column(name = "MaCTPN")
    private int codeDetailInvoice;
    
    @Column(name = "MaPhieuNhap")
    private int codeInvoice;
    
    @ManyToOne
    @JoinColumn(name = "MaSanPham", referencedColumnName = "MaSanPham")
    private Product product;
    
    @Column(name = "SoLuong")
    private int quantity;
    
    @Column(name = "TongTien")
    private double totalDcash;
    
    @Column(name = "ChuThich")
    private String description;
    
    
}
