package com.triana.salesianos.dam.monumentosv2.servicio;


import com.triana.salesianos.dam.monumentosv2.modelos.Monumento;
import com.triana.salesianos.dam.monumentosv2.repositorio.MonumentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonumentoServicio {

    @Autowired
    private MonumentoRepositorio monumentoRepositorio;

    public MonumentoServicio(MonumentoRepositorio monumentoRepositorio) {
        this.monumentoRepositorio = monumentoRepositorio;
    }


    public List<Monumento> findAll() {

        return monumentoRepositorio.findAll();
    }


    public Monumento findById(Long id) {

        return monumentoRepositorio.findById(id).orElse(null);
    }


    public Monumento save(Monumento monumento) {

        return monumentoRepositorio.save(monumento);
    }


    public Monumento edit(Monumento monumento, Long id) {

        Monumento monumentoEncontrado = monumentoRepositorio.findById(id).orElse(null);
        if (monumentoEncontrado != null) {
            return monumentoRepositorio.save(monumentoEncontrado);
        }
        return monumentoRepositorio.save(monumento);
    }


    public void delete(Long id) {
        monumentoRepositorio.deleteById(id);
    }


}
