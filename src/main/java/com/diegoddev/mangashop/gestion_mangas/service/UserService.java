package com.diegoddev.mangashop.gestion_mangas.service;

import com.diegoddev.mangashop.gestion_mangas.model.User;
import com.diegoddev.mangashop.gestion_mangas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsernameIgnoreCase(username);
    }

    public User registerUser(User user) {
        return userRepository.save(user);
    }

}
