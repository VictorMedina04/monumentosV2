package com.triana.salesianos.dam.monumentosv2.repositorio;


import com.triana.salesianos.dam.monumentosv2.modelos.Monumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonumentoRepositorio extends JpaRepository<Monumento, Long> {

}
