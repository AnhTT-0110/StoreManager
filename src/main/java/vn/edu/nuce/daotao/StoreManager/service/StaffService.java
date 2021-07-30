/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service;

import java.util.List;
import vn.edu.nuce.daotao.StoreManager.response.StaffResponse;

/**
 *
 * @author Anh
 */
public interface StaffService {

    List<StaffResponse> getAllStaffResponses();

    List<Object[]> getAllStaffResponseObjects();

    boolean updateStaff(int statusBtn, StaffResponse staffResponse);

    boolean deleteStaff(StaffResponse staffResponse);
    
}
