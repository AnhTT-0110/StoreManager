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
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Anh
 */
@Entity
@Table(name = "chitiethoadon")
@Data
public class BillDetail implements Serializable{
    
    @Id
    @Column(name = "MaCTHD")
    private int codeBillDetail;
    
    @Column(name = "MaHoaDon")
    private int codeBill;
    
    @Column(name = "MaSanPham")
    private int codeProduct;
    
    @Column(name = "SoLuong")
    private int quantity;
    
    @Column(name = "TongTien")
    private double totalCash;
    
     @Column(name = "GhiChu")
    private String description;
    
    
    
}
