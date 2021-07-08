package com.test.project;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }
    @RequestMapping("/index")
    public String listAllFunFiction() {
        return "index";
    }
}
