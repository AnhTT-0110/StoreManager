/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.Type;

/**
 *
 * @author Anh
 */
@Entity
@Data
@Table(name = "khachhang")
public class Customer implements Serializable {

    @Id
    @Column(name = "MaKhachHang")
    private int codeCustomer;

    @Column(name = "TenKhachHang")
    private String nameCustomer;

    @Column(name = "Ngaysinh")
    @Type(type = "date")
    private Date birthday;

    @Column(name = "GioiTinh")
    private int sex;

    @Column(name = "DiaChi")
    private String address;

    @Column(name = "SDT")
    private String phoneNumber;

    @Column(name = "GhiChu")
    private String description;
    
    @OneToMany(mappedBy = "customer")
    @ToString.Exclude
    private Collection<Bill> bills;
    
    @JoinColumn(name = "LoaiKhachHang", referencedColumnName = "MaLoaiKhachHang")
    @ManyToOne(optional = false)
    @ToString.Exclude
    private CustomerType customerType;

}
