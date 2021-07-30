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
    
    @OneToMany(mappedBy = "position")
    private Collection<Staff> positionCollection;
    
    

}
