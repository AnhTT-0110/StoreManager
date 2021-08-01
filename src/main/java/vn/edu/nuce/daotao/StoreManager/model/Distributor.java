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
@Table(name = "nhaphanphoi")
public class Distributor implements Serializable {
    
    @Id
    @Column(name = "MaNhaPhanPhoi")
    private int codeDistributor;
    
    @Column(name = "TenNhaPhanPhoi")
    private String nameDistributor;
    
    @Column(name = "DiaChi")
    private String address;
    
    @Column(name = "SDT")
    private String phoneNumber;
    
    @Column(name = "Email")
    private String email;
    
    @Column(name = "ChuThich")
    private String description;
    
    @OneToMany(mappedBy = "distributor")
    private Collection<Receipt> receipts;
    
}
