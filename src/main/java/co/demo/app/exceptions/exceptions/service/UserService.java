package co.demo.app.exceptions.exceptions.service;

import java.util.List;

import co.demo.app.exceptions.exceptions.model.domain.User;

public interface UserService {
    
    User findById(Long id);
    List<User> findAll();
}
