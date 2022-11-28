package com.mundial.implement;

import com.mundial.entity.Seleccion;
import com.mundial.service.SeleccionService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SeleccionImplement implements SeleccionService {
    @Override
    public List<Seleccion> listarSeleccioness() {
        return null;
    }

    @Override
    public void guardar(Seleccion seleccion) {

    }

    @Override
    public void eliminar(Seleccion seleccion) {

    }

    @Override
    public Seleccion encontrarSeleccion(Seleccion seleccion) {
        return null;
    }
}
