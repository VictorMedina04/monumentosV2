package com.triana.salesianos.dam.monumentosv2.Controlador;


import com.triana.salesianos.dam.monumentosv2.modelos.Monumento;
import com.triana.salesianos.dam.monumentosv2.servicio.MonumentoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monumento")
@RequiredArgsConstructor
public class MonumentoControlador {

    @Autowired
    private MonumentoServicio monumentoServicio;

    //mostrar todos los monumentos
    @GetMapping("/")
    public ResponseEntity<List<Monumento>> indice (Model model) {
        return new ResponseEntity<>(monumentoServicio.findAll(), HttpStatus.OK) ;
    }

    //mostrar un monumento por id
    @GetMapping("/{id}")
    public ResponseEntity mostrarMonumento(Model model, @PathVariable Long id) {
        Monumento monumento = monumentoServicio.findById(id);
        return monumento != null ? new ResponseEntity<>(monumento, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.CREATED);
    }

    //añadir un monumento
    @PostMapping("/")
    public ResponseEntity<Monumento> crearMonumento(@RequestBody Monumento monumento) {
        monumento = monumentoServicio.save(monumento);
        return new ResponseEntity<>(monumento, HttpStatus.CREATED);
    }


    //editar un monumento
    @PutMapping("/{id}")
        public ResponseEntity<Monumento> editMonumento(@PathVariable long id, @RequestBody Monumento monumento) {
        return ResponseEntity.ok(monumentoServicio.edit(monumento, id));
    }

    //borrar un monumento
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarMonumento(@PathVariable long id) {
        monumentoServicio.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}