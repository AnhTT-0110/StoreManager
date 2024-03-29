/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.transfomer;

import java.util.List;
import org.springframework.stereotype.Component;
import vn.edu.nuce.daotao.StoreManager.model.Account;
import vn.edu.nuce.daotao.StoreManager.model.Permission;
import vn.edu.nuce.daotao.StoreManager.model.Staff;
import vn.edu.nuce.daotao.StoreManager.response.AccountResponse;

/**
 *
 * @author Anh
 */
@Component
public class AccountTransformer {

    public Object[] transform(Account account) {
        Object[] item = new Object[8];
        item[1] = account.getCodeAccount();
        item[2] = account.getStaff().getCodeStaff();
        item[3] = account.getStaff().getNameStaff();
        item[4] = account.getUsername();
        item[5] = account.getPassword();
        item[6] = account.getPermission().getNamePermission();
        item[7] = account.getDescription();
        return item;
    }
    
    public AccountResponse transformToResponse(Account account) {
        AccountResponse accountResponse = new AccountResponse();
        accountResponse.setCodeAccount(String.valueOf(account.getCodeAccount()));
        accountResponse.setCodeStaff(String.valueOf(account.getStaff().getCodeStaff()));
        accountResponse.setNameStaff(account.getStaff().getNameStaff());
        accountResponse.setUsername(account.getUsername());
        accountResponse.setPassword(account.getPassword());
        accountResponse.setPermission(account.getPermission().getNamePermission());
        accountResponse.setPermissionCode(String.valueOf(account.getPermission().getCodePermission()));
        accountResponse.setDescription(account.getDescription());
        return accountResponse;
    }

    public Account transformToEntity(AccountResponse accountResponse, List<Staff> staffs, List<Permission> permissions) {
        Account account = new Account();
        account.setCodeAccount(Integer.valueOf(accountResponse.getCodeAccount()));
        account.setUsername(accountResponse.getUsername());
        account.setPassword(accountResponse.getPassword());
        account.setDescription(accountResponse.getDescription());
        staffs
                .stream()
                .filter(staff -> staff.getCodeStaff() == (Integer.valueOf(accountResponse.getCodeStaff())))
                .findAny()
                .ifPresent(item -> account.setStaff(item));
        permissions
                .stream()
                .filter(permission -> permission.getNamePermission().equals(accountResponse.getPermission()))
                .findAny()
                .ifPresent(item -> account.setPermission(item));
        return account;
    }
}
