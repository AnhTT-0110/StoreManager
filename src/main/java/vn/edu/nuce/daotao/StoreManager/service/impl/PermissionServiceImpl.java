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
import vn.edu.nuce.daotao.StoreManager.response.PermissionResponse;
import vn.edu.nuce.daotao.StoreManager.respository.PermissionRepository;
import vn.edu.nuce.daotao.StoreManager.service.*;
import vn.edu.nuce.daotao.StoreManager.transfomer.PermissionTransformer;

/**
 *
 * @author Anh
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    @Autowired
    private PermissionTransformer permissionTransformer;

    @Override
    public List<PermissionResponse> getAllPermission() {
        return permissionRepository.findAll()
                .stream()
                .map(permissionTransformer::transform)
                .collect(Collectors.toList());
    }
}
