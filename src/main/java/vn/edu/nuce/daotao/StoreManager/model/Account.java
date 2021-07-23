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
@Data
@Table(name = "users")
public class Account implements Serializable {

    @Id
    @Column(name = "ID")
    private int codeProduct;

    @Column(name = "MaNhanVien")
    private String codeStaff;

    @Column(name = "TenDangNhap")
    private String username;

    @Column(name = "Password")
    private String password;

    @Column(name = "Quyen")
    private String codePermission;

    @Column(name = "ChuThich")
    private String description;

}
