package com.mundial.implement;

import com.mundial.entity.Estadio;
import com.mundial.service.EstadioService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstadioImplement implements EstadioService {
    @Override
    public List<Estadio> listarEstadios() {
        return null;
    }

    @Override
    public void guardar(Estadio estadio) {

    }

    @Override
    public void eliminar(Estadio estadio) {

    }

    @Override
    public Estadio encontrarEstadio(Estadio estadio) {
        return null;
    }
}
