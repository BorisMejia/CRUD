package com.app.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.crud.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
