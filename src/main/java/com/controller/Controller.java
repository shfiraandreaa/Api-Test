package com.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.entity.Pertandingan;
import com.service.PertandinganService;

@RestController
@RequestMapping("/api/pertandingan")
public class Controller {
    
    @Autowired
    private PertandinganService services;

    @GetMapping("/{id}")
    public ResponseEntity<Pertandingan> findById(@PathVariable("id") Long id){
        Optional<Pertandingan> findById = services.findById(id);
        return findById.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.noContent().build());
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){
        List<Pertandingan> findAll = services.findAll();
        return ResponseEntity.ok(findAll);
    }

    @GetMapping("/findDesc")
    public ResponseEntity<?> find(){
        List<Pertandingan> findAll = services.findAll();
        return ResponseEntity.ok(findAll);
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody @Valid Pertandingan value){
        try{
            Pertandingan save = services.save(value);
            return ResponseEntity.ok(save);
        }catch(DataAccessException e){
            return new ResponseEntity<>(e.getLocalizedMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody @Valid Pertandingan value){
        try{
            Pertandingan save = services.save(value);
            return ResponseEntity.ok(save);
        }catch(DataAccessException e){
            return new ResponseEntity<>(e.getLocalizedMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id){
        services.removeById(id);
    }

}
