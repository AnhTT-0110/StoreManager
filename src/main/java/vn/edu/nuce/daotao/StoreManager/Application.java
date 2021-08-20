/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import vn.edu.nuce.daotao.StoreManager.view.frame.Login;

/**
 *
 * @author Anh
 */
@SpringBootApplication
@EnableScheduling
@Log4j2
public class Application {

    public static ConfigurableApplicationContext applicationContext;

    public static void main(String args[]) {
        log.info("MainFrame {} starting...");
        SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
        builder.headless(false);
        applicationContext = builder.run(args);
        log.info("MainFrame {} started.");
        Login service = applicationContext.getBean(Login.class);
        service.initData();
    }

}
