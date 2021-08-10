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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author Anh
 */
@Entity
@Data
@Table(name = "users")
public class Account implements Serializable {

    @Id
    @Column(name = "ID")
    private int codeAccount;

    @Column(name = "TenDangNhap")
    private String username;

    @Column(name = "Password")
    private String password;

    @Column(name = "ChuThich")
    private String description;
    
    @JoinColumn(name = "MaNhanVien", referencedColumnName = "MaNhanVien")
    @ToString.Exclude
    @OneToOne(optional = false)
   
    private Staff staff;
    
    @JoinColumn(name = "Quyen", referencedColumnName = "MaQuyen")
    @ManyToOne(optional = false)
    private Permission permission;

}
