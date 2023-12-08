package com.example.Users.service;

import com.example.Users.model.User;
import com.example.Users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(int userId) {
        return userRepository.findById(userId);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(int userId ,User user) {
        User userOld = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalStateException("user with Id " + userId + " does not exist"));
        if (Objects.equals(user.getId(), userOld.getId())){
             return this.userRepository.save(user);
        }else {
            throw new IllegalArgumentException("Can not change the ID during update");
        }
    }

    public boolean deleteUserById(int userId) {

        boolean exists = userRepository.existsById(userId);
        if (!exists) {
            throw new IllegalStateException("user with Id " + userId + " not exists");
        }
        userRepository.deleteById(userId);
        return true;
    }

    // Add more methods as per your business logic or requirements
}
