package com.mundial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "estadio")
public class Estadio implements Serializable {
    @Id
    private int id;
    private String nombre;
    private int capacidad;
}
