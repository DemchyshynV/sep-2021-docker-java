package com.example.sep2021dockerjava.dao;

import com.example.sep2021dockerjava.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
}
