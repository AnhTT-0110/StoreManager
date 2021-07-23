/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;


/**
 *
 * @author Anh
 */
@Entity
@Table(name = "chucvu")
@Data
public class Position implements Serializable {

    @Id
    @Column(name = "MaChucVu")
    private int codePosition;

    @Column(name = "TenChucVu")
    private String namePosition;

    @Column(name = "GhiChu")
    private String description;

}
