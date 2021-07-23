/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.nuce.daotao.StoreManager.model.Position;

/**
 *
 * @author Anh
 */
public interface PositionRespository extends JpaRepository<Position, Long> {
    
}
