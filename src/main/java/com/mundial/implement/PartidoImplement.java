package com.mundial.implement;

import com.mundial.entity.Partido;
import com.mundial.service.PartidoService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PartidoImplement implements PartidoService {
    @Override
    public List<Partido> listarPartidoss() {
        return null;
    }

    @Override
    public void guardar(Partido partido) {

    }

    @Override
    public void eliminar(Partido partido) {

    }

    @Override
    public Partido encontrarPartido(Partido partido) {
        return null;
    }
}
