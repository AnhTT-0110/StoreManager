/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.validator;

import lombok.Getter;

/**
 *
 * @author Anh
 */
@Getter
public enum CodeSystem {

    ERROR01("ERROR01", "Nhập sai định dạng ngày: yyyy-MM-dd"),
    ERROR02("ERROR02", "Các trường phải đầy đủ thông tin"),
    SUCCESS("SUCCESS", "Cập nhật thành công!"),
    SUCCESS02("SUCCESS02", "Đã đủ thông tin");

    private final String code;
    private final String description;

    private CodeSystem(String code, String description) {
        this.code = code;
        this.description = description;
    }
    
    

}
