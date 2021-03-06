package com.advantech.iqescloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@SpringBootApplication
public class IqescloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(IqescloudApplication.class, args);
    }

    @RequestMapping(value = "/")
    public String hello() {
        return "hello";
    }
}
