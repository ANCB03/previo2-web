package com.mundial.implement;

import com.mundial.entity.Resultado;
import com.mundial.service.ResultadoService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ResultadoImplement implements ResultadoService {
    @Override
    public List<Resultado> listarResultados() {
        return null;
    }

    @Override
    public void guardar(Resultado resultado) {

    }

    @Override
    public void eliminar(Resultado resultado) {

    }

    @Override
    public Resultado encontrarResultado(Resultado resultado) {
        return null;
    }
}
