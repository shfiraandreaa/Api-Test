package com.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tbl_user")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nama_depan", length=20)
    private String namaDepan;

    @Column(name="nama_belakang", length=20)
    private String namaBelakang;

    @Column(name="username", length=20)
    private String username;

    @Column(name="password", length=20)
    private String password;

    @Column(name="user_type", length = 20)
    private String userType;

}
