package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.entity.TimBola;
import com.repo.TimBolaRepo;

@Repository
public class TimBolaDao {
    
    @Autowired
    private TimBolaRepo tim;

    public List<TimBola> findAll(){
        return tim.findAll();
    }

    public Optional<TimBola> findById(long id){
        return tim.findById(id);
    }

    public TimBola save(TimBola value){
        return tim.save(value);
    }

    public void removeById(Long id){
        tim.deleteById(id);
    }
}
