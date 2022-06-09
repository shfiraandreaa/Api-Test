package com.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.entity.TimBola;

public interface TimBolaRepo extends CrudRepository<TimBola, Long> {
    
    List<TimBola> findAll();
}
