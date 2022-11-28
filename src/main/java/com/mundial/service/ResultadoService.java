package com.mundial.service;

import com.mundial.entity.Partido;
import com.mundial.entity.Resultado;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ResultadoService {
    public List<Resultado> listarResultados();

    public void guardar(Resultado resultado);

    public void eliminar(Resultado resultado);

    public Resultado encontrarResultado(Resultado resultado);
}
