package com.cm.cinemaneasymnager;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CinemaEasyManagerApplication {



    public static void main(String[] args) {
        SpringApplication.run(CinemaEasyManagerApplication.class, args);
    }


}
