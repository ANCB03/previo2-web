package com.mundial.controller;


import com.mundial.entity.Resultado;
import com.mundial.repository.ResultadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("resultados")
public class ResultadoController {
    @Autowired
    ResultadoRepository resultadoRepository;

    @GetMapping()
    public List<Resultado> getResultadolAll(){
        return resultadoRepository.findAll();
    }
    @GetMapping("/{id}")
    public Resultado getFacturasbyId(@PathVariable Integer id) {

        Optional<Resultado> resultados = resultadoRepository.findById(id);

        if (resultados.isPresent()) {
            return resultados.get();
        }

        return null;

    }

    @PostMapping
    public Resultado postContinente(@RequestBody Resultado resultado) {
        resultadoRepository.save(resultado);
        return resultado;
    }

    @PutMapping("/{id}")
    public Resultado putDetallesbyId(@PathVariable Integer id, @RequestBody Resultado resultado) {

        Optional<Resultado> resultadoCurrent = resultadoRepository.findById(id);

        if (resultadoCurrent.isPresent()) {

            Resultado resultadoReturn = resultadoCurrent.get();


            resultadoReturn.setPartido_id((resultado.getPartido_id()));
            resultadoReturn.setSeleccion_id(resultado.getSeleccion_id());
            resultadoReturn.setGoles(resultado.getGoles());
            resultadoReturn.setAmarillas(resultado.getAmarillas());
            resultadoReturn.setRojas(resultado.getRojas());


            resultadoRepository.save(resultadoReturn);

            return resultadoReturn;
        }

        return null;

    }

    @DeleteMapping("/{id}")
    public Resultado deleteDetallesbyId(@PathVariable Integer id) {

        Optional<Resultado> resultado = resultadoRepository.findById(id);

        if (resultado.isPresent()) {

            Resultado resultadoReturn = resultado.get();

            resultadoRepository.deleteById(id);

            return resultadoReturn;
        }

        return null;

    }
}
