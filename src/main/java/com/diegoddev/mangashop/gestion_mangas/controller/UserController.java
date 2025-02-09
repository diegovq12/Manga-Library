package com.diegoddev.mangashop.gestion_mangas.controller;

import com.diegoddev.mangashop.gestion_mangas.model.User;
import com.diegoddev.mangashop.gestion_mangas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users-api")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getUserByUsername")
    public ResponseEntity<User> getUserByUsername(@RequestParam String username) {
        User user = userService.getUserByUsername(username);
        return ResponseEntity.ok(user);
    }

//    @RequestMapping("/registerUser")
    @PostMapping("/registerUser")
    public ResponseEntity<User> registerUser(@RequestParam String username, @RequestParam String password, @RequestParam String email) {
        User user = new User();
        user.setUsername(username);



        user.setPassword(password);
        user.setEmail(email);
        return ResponseEntity.ok(userService.registerUser(user));
    }


}
