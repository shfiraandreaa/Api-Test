package com.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.model.entity.User;

public interface UserRepo extends CrudRepository<User, Long> {
    
    public List<User> findAll();

    // @Query("SELECT p FROM tbl_user p WHERE 'p'=username")
    public Optional<User> findByUsername(String username);
}
