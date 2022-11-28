package com.mundial.controller;


import com.mundial.entity.Estadio;
import com.mundial.repository.EstadioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/estadios")
public class EstadioController {

    @Autowired
    EstadioRepository estadioRepository;

    @GetMapping()
    public List<Estadio> getEstadiolAll(){
        return estadioRepository.findAll();
    }
    @GetMapping("/{id}")
    public Estadio getFacturasbyId(@PathVariable Integer id) {

        Optional<Estadio> estadios = estadioRepository.findById(id);

        if (estadios.isPresent()) {
            return estadios.get();
        }

        return null;

    }

    @PostMapping
    public Estadio postContinente(@RequestBody Estadio estadio) {
        estadioRepository.save(estadio);
        return estadio;
    }



    @DeleteMapping("/{id}")
    public Estadio deleteDetallesbyId(@PathVariable Integer id) {

        Optional<Estadio> estadio = estadioRepository.findById(id);

        if (estadio.isPresent()) {

            Estadio estadioReturn = estadio.get();

            estadioRepository.deleteById(id);

            return estadioReturn;
        }

        return null;

    }
}
