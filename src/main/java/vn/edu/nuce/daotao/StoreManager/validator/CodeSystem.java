/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.validator;

import lombok.Getter;

/**
 *
 * @author Anh
 */
@Getter
public enum CodeSystem {

    ERROR01("ERROR01", "Nhập sai định dạng ngày: yyyy-MM-dd"),
    ERROR02("ERROR02", "Các trường phải đầy đủ thông tin"),
    ERROR03("ERROR03", "Cập nhật không thành công"),
    ERROR04("ERROR04", "Cập nhật không thành công.\nNhân viên này đã có tài khoản rồi hoặc tên đăng nhập đã có người dùng"),
    ERROR05("ERROR05", "\n Nhập sai format user:\n"
            + "1. Có từ 4-> 15 kí tự\n"
            + "2. Gồm kí tự thường a->z"
            + " và các chữ số"),
    ERROR06("ERROR06", "\nNhập sai format mật khẩu :\n "
            + "1. Có độ dài từ 8-16 kí tự.\n"
            + "2. Có ít nhất 1 kí tự thường, 1 kí tự hoa và 1 chữ số\n"
            + "3. Có 1 trong những kí tự đặc biệt sau: @ # $ % ! \n"),
    ERROR07("ERROR07", "Không thể xóa nhà phân phối này vì có phiếu nhấp"),
    ERROR08("ERROR08", "Không thể xóa hóa đơn này vì có chi tiết hóa đơn"),
    ERROR09("ERROR09", "Nhập sai định dạng ngày"),
    ERROR10("ERROR10", "Nhập sai định dạng số, phải lớn hơn 0"),
    ERROR11("ERROR11", "Không thể xóa chi tiết hóa đơn này"),
    ERROR12("ERROR12", "Không thể xóa sản phầm này."),
    ERROR13("ERROR13", "Không thể xóa loại sản phầm này."),
    ERROR14("ERROR14", "Không thể xóa nhà phân phối này!"),
    ERROR15("ERROR15", "Không thể xóa phiếu nhập kho này!"),
    ERROR16("ERROR16", "Không thể xóa chi tiết phiếu nhập kho này"),
    ERROR17("ERROR17", "Không thể xóa khách hàng này"),
    ERROR18("ERROR18", "Không thể xóa chức vụ này"),
    ERROR19("ERROR18", "Không thể xóa nhân viên này"),
    ERROR20("ERROR20", "Tên đăng nhập hoặc mật khẩu không đúng"),
    SUCCESS("SUCCESS", "Cập nhật thành công!"),
    SUCCESS02("SUCCESS02", "Đã đủ thông tin"),
    SUCCESS03("SUCCESS03", "Định dạng OK"),
    SUCCESS04("SUCCESS04", "Đăng nhập thành công");

    private final String code;
    private final String description;

    private CodeSystem(String code, String description) {
        this.code = code;
        this.description = description;
    }
    
    

}
