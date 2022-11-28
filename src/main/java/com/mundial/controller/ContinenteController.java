package com.mundial.controller;

import com.mundial.entity.Continente;
import com.mundial.repository.ContinenteRepository;
import com.mundial.service.ContinenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/continentes")
public class ContinenteController {
    @Autowired
    ContinenteRepository continenteRepository;

    @GetMapping()
    public List<Continente> getContinentelAll(){
        return continenteRepository.findAll();
    }
    @GetMapping("/{id}")
    public Continente getFacturasbyId(@PathVariable Integer id) {

        Optional<Continente> continentes = continenteRepository.findById(id);

        if (continentes.isPresent()) {
            return continentes.get();
        }

        return null;

    }

    @PostMapping
    public Continente postContinente(@RequestBody Continente continente) {
        continenteRepository.save(continente);
        return continente;
    }

    @PutMapping("/{id}")
    public Continente putDetallesbyId(@PathVariable Integer id, @RequestBody Continente continente) {

        Optional<Continente> contineteCurrent = continenteRepository.findById(id);

        if (contineteCurrent.isPresent()) {

            Continente continenteReturn = contineteCurrent.get();


            continenteReturn.setNombre((continente.getNombre()));


            continenteRepository.save(continenteReturn);

            return continenteReturn;
        }

        return null;

    }

    @DeleteMapping("/{id}")
    public Continente deleteDetallesbyId(@PathVariable Integer id) {

        Optional<Continente> detalle = continenteRepository.findById(id);

        if (detalle.isPresent()) {

            Continente continenteReturn = detalle.get();

            continenteRepository.deleteById(id);

            return continenteReturn;
        }

        return null;

    }

}
