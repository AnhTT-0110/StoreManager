/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.transfomer;

import java.util.List;
import org.springframework.stereotype.Component;
import vn.edu.nuce.daotao.StoreManager.model.Position;
import vn.edu.nuce.daotao.StoreManager.model.Staff;
import vn.edu.nuce.daotao.StoreManager.response.StaffResponse;

/**
 *
 * @author Anh
 */
@Component
public class StaffTransformer {

    public StaffResponse transformToResponse(Staff staff, List<Position> position) {
        StaffResponse staffResponse = new StaffResponse();
        staffResponse.setCodeStaff(String.valueOf(staff.getCodeStaff()));
        staffResponse.setNameStaff(staff.getNameStaff());
        staffResponse.setAddress(staff.getAddress());
        staffResponse.setBirthday(staff.getBirthday().toString());
        staffResponse.setSex(staff.getSex() == 0 ? "Nam" : "Nữ");
        staffResponse.setPhoneNumber(staff.getPhoneNumber());
        staffResponse.setDescription(staff.getDescription());
        staffResponse.setDateStart(staff.getDateStart().toString());
        position
                .stream()
                .filter(item -> String.valueOf(item.getCodePosition()).equals(staff.getPosition().getCodePosition()))
                .findAny()
                .ifPresent(itemP -> staffResponse.setNamePosition(itemP.getNamePosition()));
        return staffResponse;
    }
    
    public Object[] transform(Staff staff) {
        Object[] item = new Object[10];
        item[1] = staff.getCodeStaff();
        item[2] = staff.getNameStaff();
        item[3] = staff.getBirthday();
        item[4] = staff.getSex() == 0 ? "Nam" : "Nữ";
        item[5] = staff.getDateStart();
        item[6] = staff.getPosition().getNamePosition();
        item[7] = staff.getAddress();
        item[8] = staff.getPhoneNumber();
        item[9] = staff.getDescription();
        return item;
    }
}
