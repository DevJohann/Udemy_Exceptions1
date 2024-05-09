package co.demo.app.exceptions.exceptions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.demo.app.exceptions.exceptions.model.domain.User;
import co.demo.app.exceptions.exceptions.service.UserService;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserService userService;
    
    @GetMapping
    public String index(){

        //int value = 100/0;
        int value = Integer.parseInt("xxx");
        System.out.println(value);
        return "200 OK";
    }
    @GetMapping("/show/{id}")
    public User showById(@PathVariable Long id){
        User user = userService.findById(id);
        System.out.println(user.getName());
        return user;
    }

}
