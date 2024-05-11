package co.demo.app.exceptions.exceptions.service;

import java.util.List;
import java.util.Optional;

import co.demo.app.exceptions.exceptions.model.domain.User;

public interface UserService {
    
    Optional<User> findById(Long id);
    List<User> findAll();
}
