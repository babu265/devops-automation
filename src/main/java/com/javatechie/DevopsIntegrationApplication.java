package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication
public class DevopsIntegrationApplication {

    private int counter = 0;

    public static void main(String[] args) {
        SpringApplication.run(DevopsIntegrationApplication.class, args);
    }

    @GetMapping("/")
    @ResponseBody
    public String helloWorld() {
        counter++;
        return "Hello World - " + counter;
		
    }
}  
