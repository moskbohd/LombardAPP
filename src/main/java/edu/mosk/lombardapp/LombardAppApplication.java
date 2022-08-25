package edu.mosk.lombardapp;
/*
  @author   moskb
  @project  LombardAPP
  @version  1.0.0
  @since    11.08.2022
*/

import jdk.jfr.Enabled;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class LombardAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(LombardAppApplication.class, args);
    }

}
