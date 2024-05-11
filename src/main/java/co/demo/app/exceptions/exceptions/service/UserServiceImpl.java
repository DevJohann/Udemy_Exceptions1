package co.demo.app.exceptions.exceptions.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.demo.app.exceptions.exceptions.exception.UserNotFoundException;
import co.demo.app.exceptions.exceptions.model.domain.User;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private List<User> users;

    public UserServiceImpl(){
        
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.ofNullable(users.stream().filter(u -> (u.getId().equals(id))).findFirst().orElseThrow());
    }

    @Override
    public List<User> findAll() {
        return users;
    }
    
}
