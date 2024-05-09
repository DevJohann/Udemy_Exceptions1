package co.demo.app.exceptions.exceptions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    
    @GetMapping("/app")
    public String index(){

        //int value = 100/0;
        int value = Integer.parseInt("xxx");
        System.out.println(value);
        return "200 OK";
    }
}