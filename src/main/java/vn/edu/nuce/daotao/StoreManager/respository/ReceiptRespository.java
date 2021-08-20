/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.respository;

import java.sql.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.edu.nuce.daotao.StoreManager.model.Receipt;

/**
 *
 * @author Anh
 */
@Repository
public interface ReceiptRespository extends JpaRepository<Receipt, Long> {

    @Query(nativeQuery = true, value = "{call baocaophieunhap(:maphieunhap, :Tennhaphanphoi, :TenNhanVien, :startDate, :endDate)}")
    List<Object> getReport(@Param("maphieunhap") String maphieunhap, @Param("Tennhaphanphoi") String Tennhaphanphoi,
            @Param("TenNhanVien") String TenNhanVien, @Param("startDate") Date startDate,
            @Param("endDate") Date endDate);

    @Query(nativeQuery = true, value = "{call baocaophieunhapCount(:maphieunhap, :Tennhaphanphoi, :TenNhanVien, :startDate, :endDate)}")
    List<Object> getReportCount(@Param("maphieunhap") String maphieunhap, @Param("Tennhaphanphoi") String Tennhaphanphoi,
            @Param("TenNhanVien") String TenNhanVien, @Param("startDate") Date startDate,
            @Param("endDate") Date endDate);

    @Query(nativeQuery = true, value = "{call baocaophieunhapSum(:maphieunhap, :Tennhaphanphoi, :TenNhanVien, :startDate, :endDate)}")
    List<Object> getReportSum(@Param("maphieunhap") String maphieunhap, @Param("Tennhaphanphoi") String Tennhaphanphoi,
            @Param("TenNhanVien") String TenNhanVien, @Param("startDate") Date startDate,
            @Param("endDate") Date endDate);

}
