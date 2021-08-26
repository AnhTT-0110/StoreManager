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
import vn.edu.nuce.daotao.StoreManager.model.Product;

/**
 *
 * @author Anh
 */
@Repository
public interface ProductRespository extends JpaRepository<Product, Long> {

    @Query(nativeQuery = true, value = "{call tongsanphamkhongbantrongkhoangthoigian(:startDate, :endDate)}")
    List<Object> getProductsInventory(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

    @Query(nativeQuery = true, value = "{call tongsanphamdabantrongkhoangthoigian(:startDate, :endDate)}")
    List<Object> getProducts(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

}
