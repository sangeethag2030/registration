package com.example.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springboot.model.Users;

@Repository
public interface UserJpaRepository extends JpaRepository<Users, Long> {
    boolean existsByEmailId(String email);
    Users findByEmailId(String emailId);
    Users findByResetToken(String token);

}
