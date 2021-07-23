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
@Table(name = "hangsanxuat")
public class Publisher implements Serializable {

    @Id
    @Column(name = "MaHangSanXuat")
    private int codePublisher;

    @Column(name = "TenHangSanXuat")
    private String namePublisher;

}
