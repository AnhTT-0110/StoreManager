/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.edu.nuce.daotao.StoreManager.controller.PermissionController;
import vn.edu.nuce.daotao.StoreManager.response.PermissionResponse;
import vn.edu.nuce.daotao.StoreManager.service.PermissionService;

/**
 *
 * @author Anh
 */
@Component
public class PermissionControllerImpll implements PermissionController{

    @Autowired
    private PermissionService permissionService;
    
    @Override
    public List<PermissionResponse> getAllPermission() {
        return permissionService.getAllPermission();
    }
    
}
