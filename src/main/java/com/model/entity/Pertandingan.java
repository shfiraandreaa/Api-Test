package com.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tbl_pertandingan")
public class Pertandingan {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "nama_tim")
    private String namaTim;

    @NotNull
    @Column(name = "menang")
    private Integer menang;

    @NotNull
    @Column(name = "seri")
    private Integer seri;

    @NotNull
    @Column(name = "kalah")
    private Integer kalah;

    @NotNull
    @Column(name = "gol_menang")
    private Integer golMenang;

    @NotNull
    @Column(name = "gol_kalah")
    private Integer golKalah;

    @Column(name = "selisih_gol")
    private Integer selisihGol;

    @Column(name = "jumlah_point")
    private Integer jumlahPoint;

    @Column(name = "jumlah_pertandingan")
    private Integer jumlahPertandingan;
}
