package com.mundial.service;

import com.mundial.entity.Continente;
import com.mundial.entity.Estadio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EstadioService {
    public List<Estadio> listarEstadios();

    public void guardar(Estadio estadio);

    public void eliminar(Estadio estadio);

    public Estadio encontrarEstadio(Estadio estadio);
}
