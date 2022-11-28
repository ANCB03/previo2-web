package com.mundial.controller;


import com.mundial.entity.Seleccion;
import com.mundial.repository.ContinenteRepository;
import com.mundial.repository.SeleccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/selecciones")
public class SeleccionController {
    @Autowired
    SeleccionRepository seleccionRepository;

    @GetMapping()
    public List<Seleccion> getContinentelAll(){
        return seleccionRepository.findAll();
    }
    @GetMapping("/{id}")
    public Seleccion getFacturasbyId(@PathVariable Integer id) {

        Optional<Seleccion> selecciones = seleccionRepository.findById(id);

        if (selecciones.isPresent()) {
            return selecciones.get();
        }

        return null;

    }

    @PostMapping
    public Seleccion postContinente(@RequestBody Seleccion seleccion) {
        seleccionRepository.save(seleccion);
        return seleccion;
    }

    @PutMapping("/{id}")
    public Seleccion putDetallesbyId(@PathVariable Integer id, @RequestBody Seleccion seleccion) {

        Optional<Seleccion> seleccionCurrent = seleccionRepository.findById(id);

        if (seleccionCurrent.isPresent()) {

            Seleccion seleccionReturn = seleccionCurrent.get();


            seleccionReturn.setNombre((seleccion.getNombre()));


            seleccionRepository.save(seleccionReturn);

            return seleccionReturn;
        }

        return null;

    }

    @DeleteMapping("/{id}")
    public Seleccion deleteDetallesbyId(@PathVariable Integer id) {

        Optional<Seleccion> detalle = seleccionRepository.findById(id);

        if (detalle.isPresent()) {

            Seleccion seleccionReturn = detalle.get();

            seleccionRepository.deleteById(id);

            return seleccionReturn;
        }

        return null;

    }
}
