/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.nuce.daotao.StoreManager.model.Position;
import vn.edu.nuce.daotao.StoreManager.model.Staff;
import vn.edu.nuce.daotao.StoreManager.response.StaffResponse;
import vn.edu.nuce.daotao.StoreManager.respository.PositionRespository;
import vn.edu.nuce.daotao.StoreManager.respository.StaffRespository;
import vn.edu.nuce.daotao.StoreManager.service.*;
import vn.edu.nuce.daotao.StoreManager.transfomer.StaffTransformer;

/**
 *
 * @author Anh
 */
@Service
public class StaffServiceImpl implements StaffService{
    
    @Autowired
    private StaffRespository staffRespository;

    @Autowired
    private StaffTransformer staffTransformer;
    
    @Autowired
    private PositionRespository positionRespository;
    
    @Override
    public List<StaffResponse> getAllStaffResponses() {
        List<Position> positions = positionRespository.findAll();
        return staffRespository
                .findAll()
                .stream()
                .map((Staff staff) -> staffTransformer.transformToResponse(staff, positions))
                .collect(Collectors.toList());
    }

    @Override
    public List<Object[]> getAllStaffResponseObjects() {
         List<Object[]> objects = new ArrayList<>();
       List<Staff> staffs = staffRespository.findAll();
         staffs.forEach((customer) -> {
            objects.add(staffTransformer.transform(customer));
        });
        return objects;
    }

 
}
