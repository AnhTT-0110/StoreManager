/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.response;

import lombok.Data;

/**
 *
 * @author Anh
 */
@Data
public class StaffResponse {
    
    private String codeStaff;
    private String nameStaff;
    private String birthday;
    private String sex;
    private String dateStart;
    private String address;
    private String phoneNumber;
    private String description;
    private String namePosition;
}
