package co.demo.app.exceptions.exceptions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.demo.app.exceptions.exceptions.model.domain.User;

@Configuration
public class AppConfig {
    
    @Bean
    public List<User> getUsers(){
        List<User> users = new ArrayList<>();
        users = new ArrayList<>();
        users.add(new User(1L, "Ej1", "11"));
        users.add(new User(2L, "Ej2", "12"));
        users.add(new User(3L, "Ej3", "13"));
        users.add(new User(4L, "Ej4", "14"));
        users.add(new User(5L, "Ej5", "15"));

        return users;
    }
}
