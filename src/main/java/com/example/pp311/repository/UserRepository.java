package com.example.pp311.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.pp311.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
