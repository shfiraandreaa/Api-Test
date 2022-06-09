package com.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.entity.User;

@Service
@Transactional
public class UserService {
    
    @Autowired
    private UserDao dataUser;

    public List<User> findAll(){
        return dataUser.findAll();
    }

    public Optional<User> findByName(String username){
        return dataUser.findByName(username);
    }

    public Optional<User> findById(Long id){
        return dataUser.findById(id);
    }

    public User save(User value){
        return dataUser.save(value);
    }

    public void removeById(Long id){
        dataUser.removeById(id);
    }
}
