/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.controller.impl;

import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import vn.edu.nuce.daotao.StoreManager.controller.AccountController;
import vn.edu.nuce.daotao.StoreManager.response.AccountResponse;
import vn.edu.nuce.daotao.StoreManager.service.AccountService;
import vn.edu.nuce.daotao.StoreManager.validator.CodeSystem;
import vn.edu.nuce.daotao.StoreManager.validator.Validator;

/**
 *
 * @author Anh
 */
@Controller
@Log4j2
public class AccountControllerImpl implements AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    Validator validator;

    @Override
    public List<Object[]> getAllAccountResponsesObject() {
        return accountService.getAllAccountResponseObjects();
    }

    @Override
    public CodeSystem updateAccount(int statusBtn, AccountResponse response) {
        CodeSystem codeSystem = validator.validateRegexAndAllArgumentNotNull(response.getCodeStaff(),
                response.getUsername(), response.getPassword(), response.getPermission());
        if (!CodeSystem.SUCCESS02.equals(codeSystem)) {
            return codeSystem;
        }
        codeSystem = validator.validateUser(response.getUsername());
        if (CodeSystem.ERROR05.equals(codeSystem)) {
            return codeSystem;
        }
        codeSystem = validator.validatePassword(response.getPassword());
        if (CodeSystem.ERROR06.equals(codeSystem)) {
            return codeSystem;
        }
        if (accountService.updateAccount(statusBtn, response)) {
            return CodeSystem.SUCCESS;
        }
        return CodeSystem.ERROR04;
    }

    @Override
    public boolean deleteAccount(AccountResponse response) {
        return accountService.deleteAccount(response);
    }

}
