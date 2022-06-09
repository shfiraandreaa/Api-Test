package com.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PertandinganDao;
import com.model.entity.Pertandingan;

@Service
@Transactional
public class PertandinganService {
    
    @Autowired
    private PertandinganDao dao;

    public List<Pertandingan> findAll(){
        return dao.findAll();
    }

    public List<Pertandingan> findAList(){
        return dao.find();
    }

    public Optional<Pertandingan> findById(Long id){
        return dao.findById(id);
    }

    public Pertandingan save(Pertandingan value){
        return dao.save(value);
    }

    public void removeById(Long id){
        dao.removeById(id);
    }
}
