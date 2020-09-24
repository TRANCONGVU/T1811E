package com.example.demo001.repository;

import com.example.demo001.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    //method
}
