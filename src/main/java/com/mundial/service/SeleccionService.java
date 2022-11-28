package com.mundial.service;

import com.mundial.entity.Seleccion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SeleccionService {
    public List<Seleccion> listarSeleccioness();

    public void guardar(Seleccion seleccion);

    public void eliminar(Seleccion seleccion);

    public Seleccion encontrarSeleccion(Seleccion seleccion);
}
