package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/login")
public class TestController {

    private final UserService userService;

    @Autowired
    public TestController(UserService userService) {
        this.userService = userService;
    }



    @PostMapping("/login")
    public ResponseEntity<?> getAllUsers(@RequestBody User newUser) {
        return userService.findAllById(newUser);
    }
    @PostMapping("/add")
    public ResponseEntity<?> postUser(@RequestBody User newUser) {
        return userService.postUser(newUser);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        return userService.deleteUser(id);
    }
    @PutMapping("/put/{id}")
    public ResponseEntity<?> put(@PathVariable int id, @RequestBody User user) {
        return userService.putUser(id, user);
    }


}
