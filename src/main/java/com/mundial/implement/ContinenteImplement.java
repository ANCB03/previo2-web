package com.mundial.implement;

import com.mundial.entity.Continente;
import com.mundial.repository.ContinenteRepository;
import com.mundial.service.ContinenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContinenteImplement implements ContinenteService {
    @Autowired
    private ContinenteRepository continenteRepository;
    @Override
    public List<Continente> listarContinentes() {
        return (List<Continente>) continenteRepository.findAll();
    }

    @Override
    public void guardar(Continente continente) {
        continenteRepository.save(continente);
    }

    @Override
    public void eliminar(Continente continente) {
        continenteRepository.delete(continente);
    }

    @Override
    public Continente encontrarContinente(Continente continente) {
        return continenteRepository.findById(continente.getId()).orElse(null);
    }
}
