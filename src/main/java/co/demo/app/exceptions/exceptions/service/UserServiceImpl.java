package co.demo.app.exceptions.exceptions.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import co.demo.app.exceptions.exceptions.model.domain.User;

@Service
public class UserServiceImpl implements UserService{

    private List<User> users;

    public UserServiceImpl(){
        this.users = new ArrayList<>();
        users.add(new User(1L, "Ej1", "11"));
        users.add(new User(2L, "Ej2", "12"));
        users.add(new User(3L, "Ej3", "13"));
        users.add(new User(4L, "Ej4", "14"));
        users.add(new User(5L, "Ej5", "15"));
    }

    @Override
    public User findById(Long id) {
        return users.stream().filter(u -> (u.getId().equals(id))).findFirst().orElseThrow();
    }

    @Override
    public List<User> findAll() {
        return users;
    }
    
}
