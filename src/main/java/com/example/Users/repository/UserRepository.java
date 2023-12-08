package com.example.Users.repository;

import com.example.Users.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // You can add custom query methods here if needed
//    @Query("Select s From User s where s.email = ?1")
//    Optional<User> findUserByEmail(String email);
}
