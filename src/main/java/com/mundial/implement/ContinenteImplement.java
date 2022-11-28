package com.mundial.implement;

import com.mundial.entity.Continente;
import com.mundial.service.ContinenteService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContinenteImplement implements ContinenteService {
    @Override
    public List<Continente> listarContinentes() {
        return null;
    }

    @Override
    public void guardar(Continente continente) {

    }

    @Override
    public void eliminar(Continente continente) {

    }

    @Override
    public Continente encontrarContinente(Continente continente) {
        return null;
    }
}
