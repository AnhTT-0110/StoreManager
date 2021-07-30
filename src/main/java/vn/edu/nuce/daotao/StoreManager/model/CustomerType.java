/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Anh
 */
@Entity
@Table(name = "loaikhachhang")
@Getter
@Setter
public class CustomerType implements Serializable{
    
    @Id
    @Column(name = "MaLoaiKhachHang")
    private int codeCustomerType;
    
    @Column(name = "TenLoaiKhachHang")
    private String nameCustomerType;
    
    @Column(name = "GhiChu")
    private String description;
    
    @OneToMany(mappedBy = "customerType")
    @ToString.Exclude
    private Collection<Customer> customers;

}
