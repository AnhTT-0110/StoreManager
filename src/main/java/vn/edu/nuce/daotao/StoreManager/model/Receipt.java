/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.model;

import java.io.Serializable;
import java.time.LocalDate;
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
@Table(name = "phieunhap")
public class Receipt implements Serializable{
    
    @Id
    @Column(name = "MaPhieuNhap")
    private int codeDistributor;
    
    @JoinColumn(name = "MaNhanVien", referencedColumnName = "MaNhanVien")
    @ManyToOne(optional = false)
    private Staff staff;
    
    @Column(name = "MaNhaPhanPhoi")
    private int codesDistributor;
    
    @Column(name = "TongTien")
    private double totalDcash;
    
    @Column(name = "NgayNhap")
    private LocalDate date;
    
    @Column(name = "ChuThich")
    private String description;
       
}
