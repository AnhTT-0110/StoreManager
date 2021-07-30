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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author Anh
 */
@Entity
@Data
@Table(name = "quyen")
public class Permission implements Serializable{
    
    @Id
    @Column(name = "MaQuyen")
    private int codePermission;
    
    @Column(name = "TenQuyen")
    private String namePermission;
    
    @Column(name = "ChuThich")
    private String description;
    
    @OneToMany(mappedBy = "permission" )
    @ToString.Exclude
    private Collection<Account> accounts;
    
}
