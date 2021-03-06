package com.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication
public class SampleController {

    @RequestMapping(value = "/")
    @ResponseBody
    public String hello(){
        return "hello word";
    }

    public static void main(String [] args){
        SpringApplication.run(SampleController.class,args);

    }

}
