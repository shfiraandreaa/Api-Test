package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.stereotype.Repository;

import com.model.entity.Pertandingan;
import com.repo.PertandinganRepo;

@Repository
public class PertandinganDao {
    
    @Autowired
    private PertandinganRepo repo;

    public List<Pertandingan> findAll(){
        return repo.findAll();
    }

    @Query("SELECT * FROM tbl_pertandingan ORDER BY jumlah_point DESC")
    public List<Pertandingan> find(){
        return repo.findAll();
    }
    
    public Optional<Pertandingan> findById(Long id){
        return repo.findById(id);
    }

    public Pertandingan save(Pertandingan value){
        return repo.save(value);
    }

    public void removeById(Long id){
        repo.deleteById(id);
    }
}
