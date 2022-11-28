package com.mundial.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Entity
@Data
@Table(name = "resultado")
public class Resultado implements Serializable {
    @Id
    private int id;
    @ManyToOne
    @JoinColumn(name = "id")
    private Partido partido_id;
    @ManyToOne
    @JoinColumn(name = "id")
    private Seleccion seleccion_id;
    private int goles;
    private int amarillas;
    private int rojas;
}
