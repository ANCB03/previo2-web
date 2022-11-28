package com.mundial.controller;


import com.mundial.entity.Partido;
import com.mundial.repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/partidos")
public class PartidoController {
    @Autowired
    PartidoRepository partidoRepository;

    @GetMapping()
    public List<Partido> getContinentelAll(){
        return partidoRepository.findAll();
    }
    @GetMapping("/{id}")
    public Partido getFacturasbyId(@PathVariable Integer id) {

        Optional<Partido> partidos = partidoRepository.findById(id);

        if (partidos.isPresent()) {
            return partidos.get();
        }

        return null;

    }

    @PostMapping
    public Partido postContinente(@RequestBody Partido partido) {
        partidoRepository.save(partido);
        return partido;
    }

    @PutMapping("/{id}")
    public Partido putDetallesbyId(@PathVariable Integer id, @RequestBody Partido partido) {

        Optional<Partido> partidoCurrent = partidoRepository.findById(id);

        if (partidoCurrent.isPresent()) {

            Partido partidoReturn = partidoCurrent.get();


            //partidoReturn.setNombre((seleccion.getNombre()));


            partidoRepository.save(partidoReturn);

            return partidoReturn;
        }

        return null;

    }

    @DeleteMapping("/{id}")
    public Partido deleteDetallesbyId(@PathVariable Integer id) {

        Optional<Partido> partido = partidoRepository.findById(id);

        if (partido.isPresent()) {

            Partido partidoReturn = partido.get();

            partidoRepository.deleteById(id);

            return partidoReturn;
        }

        return null;

    }
}
