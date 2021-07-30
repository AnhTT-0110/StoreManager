/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.controller;

import java.util.List;
import vn.edu.nuce.daotao.StoreManager.response.CustomerResponse;
import vn.edu.nuce.daotao.StoreManager.response.StaffResponse;
import vn.edu.nuce.daotao.StoreManager.validator.CodeSystem;

/**
 *
 * @author Anh
 */
public interface StaffController {

    List<Object[]> getAllStaffResponsesObject();

    List<StaffResponse> getAllStaffResponses();

    CodeSystem updateStaff(int statusBtn, StaffResponse response);

    boolean deleteStaff(StaffResponse staffResponse);
}
