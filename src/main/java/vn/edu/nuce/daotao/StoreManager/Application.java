/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager;

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
public class Application {

    public static ConfigurableApplicationContext applicationContext;

    public static void main(String args[]) {
        System.out.println("MainFrame {} starting...");
        SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
        builder.headless(false);
        applicationContext = builder.run(args);
        System.out.println("MainFrame {} started.");
        Login service = applicationContext.getBean(Login.class);
        service.initData();

    }

}
