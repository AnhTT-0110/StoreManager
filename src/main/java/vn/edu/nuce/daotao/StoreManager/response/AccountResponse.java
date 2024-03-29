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
public class AccountResponse {

    private String codeAccount;
    private String username;
    private String password;
    private String description;
    private String codeStaff;
    private String nameStaff;
    private String permission;
    private String permissionCode;

    public AccountResponse(String codeAccount, String username, String password, String description, String codeStaff, String permission) {
        this.codeAccount = codeAccount;
        this.username = username;
        this.password = password;
        this.description = description;
        this.codeStaff = codeStaff;
        this.permission = permission;
    }

    public AccountResponse() {
    }

}
