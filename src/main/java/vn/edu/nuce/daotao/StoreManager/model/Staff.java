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
    private int codeProductType;

    @Column(name = "TenNhanVien")
    private String nameStaff;

    @Column(name = "NgaySinh")
    private LocalDate birthday;

    @Column(name = "GioiTinh")
    private int sex;

    @Column(name = "NgayVaoLam")
    private LocalDate dateStart;

    @Column(name = "ChucVu")
    private int position;

    @Column(name = "DiaChi")
    private String address;

    @Column(name = "SoDT")
    private String phoneNumber;

    @Column(name = "GhiChu")
    private String description;
}
