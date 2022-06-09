package com.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.entity.Pertandingan;

public interface PertandinganRepo extends CrudRepository<Pertandingan, Long>{

    List<Pertandingan> findAll();
}