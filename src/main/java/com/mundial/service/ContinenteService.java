package com.mundial.service;

import com.mundial.entity.Continente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContinenteService {
    public List<Continente> listarContinentes();

    public void guardar(Continente continente);

    public void eliminar(Continente continente);

    public Continente encontrarContinente(Continente continente);
}
