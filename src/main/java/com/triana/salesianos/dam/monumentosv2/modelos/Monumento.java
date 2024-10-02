package com.triana.salesianos.dam.monumentosv2.modelos;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Monumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombreMonumento;

    @Column(nullable = false, length = 2)
    private String codigoPais;

    @Column(nullable = false)
    private String nombrePais;

    @Column(nullable = false)
    private String nombreCiudad;

    @Column(nullable = false)
    private double latitud;

    @Column(nullable = false)
    private double longitud;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private String urlFoto;
}
