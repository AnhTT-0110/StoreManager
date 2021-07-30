/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.transfomer;

import org.springframework.stereotype.Component;
import vn.edu.nuce.daotao.StoreManager.model.Permission;
import vn.edu.nuce.daotao.StoreManager.response.PermissionResponse;

/**
 *
 * @author Anh
 */
@Component
public class PermissionTransformer {

    public PermissionResponse transform(Permission permission) {
        PermissionResponse response = new PermissionResponse();
        response.setCodePermission(permission.getCodePermission());
        response.setNamePermission(permission.getNamePermission());
        response.setDescription(permission.getDescription());
        return response;
    }

}
