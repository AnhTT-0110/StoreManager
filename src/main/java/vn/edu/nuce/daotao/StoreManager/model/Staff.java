/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Anh
 */
@Entity
@Data
@Table(name = "nhanvien")
public class Staff implements Serializable {

    @Id
    @Column(name = "MaNhanVien")
    private int codeStaff;

    @Column(name = "TenNhanVien")
    private String nameStaff;

    @Column(name = "NgaySinh")
    private Date birthday;

    @Column(name = "GioiTinh")
    private int sex;

    @Column(name = "NgayVaoLam")
    private Date dateStart;

    @Column(name = "DiaChi")
    private String address;

    @Column(name = "SoDT")
    private String phoneNumber;

    @Column(name = "GhiChu")
    private String description;

    @OneToMany(mappedBy = "staff")
    private Collection<Bill> billCollection;

    @JoinColumn(name = "ChucVu", referencedColumnName = "MaChucVu")
    @ManyToOne(optional = false)
    private Position position;

    @OneToMany(mappedBy = "staff")
    private Collection<Receipt> receiptCollection;

    @OneToOne(mappedBy = "staff")
    private Account account;

    @OneToMany(mappedBy = "staff")
    private Collection<Account> accountCollection;
    
}
