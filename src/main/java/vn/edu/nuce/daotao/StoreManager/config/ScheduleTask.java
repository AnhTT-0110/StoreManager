/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author Anh
 */
@Component
@Log4j2
public class ScheduleTask {

    @Scheduled(fixedRate = 60 * 1000)
    public void garbage() {
        System.gc();
        log.info("Garbage GC: ...  ");
    }

}
