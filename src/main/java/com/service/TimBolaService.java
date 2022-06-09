package com.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TimBolaDao;
import com.model.entity.TimBola;

@Service
@Transactional
public class TimBolaService {
    
    @Autowired
    private TimBolaDao timDao;

    public List<TimBola> findAll(){
        return timDao.findAll();
    }

    public Optional<TimBola> findById(Long id){
        return timDao.findById(id);
    }

    public TimBola save(TimBola value){
        return timDao.save(value);
    }

    public void removeById(Long id){
        timDao.removeById(id);
    }
}
