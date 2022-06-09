package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.repository.query.Query;
// import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.stereotype.Repository;

import com.model.entity.User;
import com.repo.UserRepo;

@Repository
public class UserDao {
    
    @Autowired
    private UserRepo user;

    public List<User> findAll(){
        return user.findAll();
    }

    @Query("SELECT p FROM tbl_user p WHERE 'p'===username")
    public Optional<User> findByName(String username){
        return user.findByUsername(username);
    }

    public Optional<User> findById(long id){
        return user.findById(id);
    }

    public User save(User value){
        return user.save(value);
    }

    public void removeById(Long id){
        user.deleteById(id);
    }
}
