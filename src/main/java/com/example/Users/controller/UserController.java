package com.example.Users.controller;

import com.example.Users.model.User;
import com.example.Users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(path ="/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>( users, HttpStatus.OK);
    }

    @GetMapping(path = "/{userId}")
    public ResponseEntity<Optional<User>> getUserById(@PathVariable int userId) {
        Optional<User> user = userService.getUserById(userId);
        if (user.isPresent()) {
            return new ResponseEntity<Optional<User>>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @PutMapping(path= "/{userId}")
    public ResponseEntity<User> updateUser(@PathVariable int userId, @RequestBody User user) {
        return new ResponseEntity<>(userService.updateUser(userId,user), HttpStatus.OK);
    }

    @DeleteMapping(path ="/{userId}")
    public ResponseEntity<Map<String, String>> deleteUser(@PathVariable int userId) {
        Map<String, String> response = new HashMap<>();
        if (userService.deleteUserById(userId)) {
            response.put("message", "User deleted successfully");
            return new ResponseEntity<Map<String, String>>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
