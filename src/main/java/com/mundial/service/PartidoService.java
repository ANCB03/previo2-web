package com.mundial.service;

import com.mundial.entity.Estadio;
import com.mundial.entity.Partido;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PartidoService {
    public List<Partido> listarPartidoss();

    public void guardar(Partido partido);

    public void eliminar(Partido partido);

    public Partido encontrarPartido(Partido partido);
}
