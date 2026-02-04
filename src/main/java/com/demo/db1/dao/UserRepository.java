package com.demo.db1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.db1.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
