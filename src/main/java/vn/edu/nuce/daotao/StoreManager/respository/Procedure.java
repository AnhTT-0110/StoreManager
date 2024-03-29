/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.respository;

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
public interface Procedure extends JpaRepository<Bill,Long> {

    @Query(nativeQuery = true, value = "call doanhthutheothang(:yearNumber)")
    List<Object> getDoanhThu(@Param("yearNumber") String year);

    @Query(nativeQuery = true, value = "call tongtientrongthang")
    List<Object> sumDCashInMounth();

    @Query(nativeQuery = true, value = "call tongsohoadontrongthang")
    List<Object> countBillInMount();

    @Query(nativeQuery = true, value = "call tongsanphamtrongthang")
    List<Object> countProductInMount();

    @Query(nativeQuery = true, value = "call tongsophieunhaptrongthang")
    List<Object> countReceiptInMount();
    
    @Query(nativeQuery = true, value = "call doanhthutheothangNam")
    List<Object> turnoverByTime();

}
