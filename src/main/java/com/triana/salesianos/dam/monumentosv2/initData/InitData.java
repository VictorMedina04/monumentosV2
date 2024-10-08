package com.triana.salesianos.dam.monumentosv2.initData;


import com.triana.salesianos.dam.monumentosv2.modelos.Monumento;
import com.triana.salesianos.dam.monumentosv2.repositorio.MonumentoRepositorio;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitData {

    @Autowired
    private MonumentoRepositorio monumentoRepositorio;

    @PostConstruct
    public void init() {

        Monumento puertaDelSol = new Monumento();
        puertaDelSol.setCodigoPais("ES");
        puertaDelSol.setNombrePais("España");
        puertaDelSol.setNombreCiudad("Madrid");
        puertaDelSol.setLatitud(40.416775);
        puertaDelSol.setLongitud(-3.703790);
        puertaDelSol.setNombreMonumento("Puerta del Sol");
        puertaDelSol.setDescripcion("Un famoso punto de referencia en Madrid.");
        puertaDelSol.setUrlFoto("http://example.com/puerta_del_sol.jpg");

        monumentoRepositorio.save(puertaDelSol);


        Monumento torreBelem = new Monumento();
        torreBelem.setCodigoPais("PT");
        torreBelem.setNombrePais("Portugal");
        torreBelem.setNombreCiudad("Lisboa");
        torreBelem.setLatitud(38.691583);
        torreBelem.setLongitud(-9.215000);
        torreBelem.setNombreMonumento("Torre de Belém");
        torreBelem.setDescripcion("Una torre histórica situada en Lisboa.");
        torreBelem.setUrlFoto("http://example.com/torre_de_belem.jpg");

        monumentoRepositorio.save(torreBelem);


        Monumento machuPicchu = new Monumento();
        machuPicchu.setCodigoPais("PE");
        machuPicchu.setNombrePais("Perú");
        machuPicchu.setNombreCiudad("Cusco");
        machuPicchu.setLatitud(-13.163141);
        machuPicchu.setLongitud(-72.544963);
        machuPicchu.setNombreMonumento("Machu Picchu");
        machuPicchu.setDescripcion("Una antigua ciudad inca en los Andes.");
        machuPicchu.setUrlFoto("http://example.com/machu_picchu.jpg");

        monumentoRepositorio.save(machuPicchu);
    }

}
