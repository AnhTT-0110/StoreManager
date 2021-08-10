/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service;

import java.util.List;
import vn.edu.nuce.daotao.StoreManager.response.AccountResponse;

/*
 *
 * @author Anh
 */
public interface AccountService {

    List<Object[]> getAllAccountResponseObjects();

    boolean updateAccount(int statusBtn, AccountResponse accountResponse);

    boolean deleteAccount(AccountResponse accountResponse);
    
    AccountResponse getAccountByUserAndPass(String userName, String password);
}
