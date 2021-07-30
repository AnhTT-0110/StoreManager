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
import lombok.ToString;

/**
 *
 * @author Anh
 */
@Data
@Entity
@Table(name = "hoadon")
public class Bill implements Serializable {
    
    @Id
    @Column(name = "MaHoaDon")
    private int codeBill;
    
    @JoinColumn(name = "MaKhachHang", referencedColumnName = "MaKhachHang")
    @ManyToOne(optional = false)
    @ToString.Exclude
    private Customer customer;
    
    @JoinColumn(name = "MaNhanVien", referencedColumnName = "MaNhanVien")
    @ManyToOne(optional = false)
    @ToString.Exclude
    private Staff staff;
 
    @Column(name = "NgayLapHoaDon")
    private int date;
    
    @Column(name = "TongTien")
    private int totalDcash;
    
    @Column(name = "GhiChu")
    private int description;    
    
}
