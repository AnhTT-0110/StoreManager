/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.nuce.daotao.StoreManager.model.Account;
import vn.edu.nuce.daotao.StoreManager.model.Permission;
import vn.edu.nuce.daotao.StoreManager.model.Staff;
import vn.edu.nuce.daotao.StoreManager.response.AccountResponse;
import vn.edu.nuce.daotao.StoreManager.respository.AccountRespository;
import vn.edu.nuce.daotao.StoreManager.respository.PermissionRepository;
import vn.edu.nuce.daotao.StoreManager.respository.StaffRespository;
import vn.edu.nuce.daotao.StoreManager.service.*;
import vn.edu.nuce.daotao.StoreManager.transfomer.AccountTransformer;

/*
 *
 * @author Anh
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRespository accountRespository;

    @Autowired
    private AccountTransformer accountTransformer;

    @Autowired
    private StaffRespository respository;

    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public List<Object[]> getAllAccountResponseObjects() {
        return accountRespository
                .findAll()
                .stream()
                .map(account -> accountTransformer.transform(account))
                .collect(Collectors.toList());
    }

    @Override
    public boolean updateAccount(int statusBtn, AccountResponse accountResponse) {
        int checkBtn = statusBtn;
        List<Staff> staffs = respository.findAll();
        List<Permission> positions = permissionRepository.findAll();
        Account account = accountTransformer.transformToEntity(accountResponse, staffs, positions);
        switch (checkBtn) {
            case 2:
            case 3:
                accountRespository.save(account);
                return true;
            case 4:
                accountRespository.delete(account);
                return true;
        }
        return false;
    }

    @Override
    public boolean deleteAccount(AccountResponse accountResponse) {
        List<Staff> staffs = respository.findAll();
        List<Permission> positions = permissionRepository.findAll();
        Account account = accountTransformer.transformToEntity(accountResponse, staffs, positions);
        accountRespository.delete(account);
        return true;
    }

}
