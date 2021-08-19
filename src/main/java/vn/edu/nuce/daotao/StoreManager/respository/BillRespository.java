
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
import vn.edu.nuce.daotao.StoreManager.model.Bill;

/**
 *
 * @author Anh
 */
@Repository
public interface BillRespository extends JpaRepository<Bill, Long> {

        @Query(nativeQuery = true, value = "call doanhthutheothang(:yearNumber)")
    List<Object> getDoanhThu(@Param("yearNumber") String year);

    @Query(nativeQuery = true, value = "{call baocaohoadon(:mahoadon, :TenKhachhang, :TenNhanVien, :startDate, :endDate)}")
    List<Object> getReport(@Param("mahoadon") String mahoadon,@Param("TenKhachhang") String TenKhachhang,
            @Param("TenNhanVien") String TenNhanVien,@Param("startDate") Date startDate,
            @Param("endDate") Date endDate);
    
     @Query(nativeQuery = true, value = "{call baocaohoadonCount(:mahoadon, :TenKhachhang, :TenNhanVien, :startDate, :endDate)}")
    List<Object> getReportCount(@Param("mahoadon") String mahoadon,@Param("TenKhachhang") String TenKhachhang,
            @Param("TenNhanVien") String TenNhanVien,@Param("startDate") Date startDate,
            @Param("endDate") Date endDate);
    
       @Query(nativeQuery = true, value = "{call baocaohoadonSum(:mahoadon, :TenKhachhang, :TenNhanVien, :startDate, :endDate)}")
    List<Object> getReportSum(@Param("mahoadon") String mahoadon,@Param("TenKhachhang") String TenKhachhang,
            @Param("TenNhanVien") String TenNhanVien,@Param("startDate") Date startDate,
            @Param("endDate") Date endDate);


}
