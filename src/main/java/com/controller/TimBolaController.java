package com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.entity.TimBola;
import com.service.TimBolaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/tim")
public class TimBolaController {
    
    @Autowired
    private TimBolaService services;

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){
        List<TimBola> findAll = services.findAll();
        return ResponseEntity.ok(findAll);
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody @Valid TimBola value){
        try{
            TimBola save = services.save(value);
            return ResponseEntity.ok(save);
        }catch(DataAccessException e){
            return new ResponseEntity<>(e.getLocalizedMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
