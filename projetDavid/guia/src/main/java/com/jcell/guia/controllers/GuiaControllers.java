package com.jcell.guia.controllers;

import com.jcell.guia.models.Direccion;
import com.jcell.guia.models.Informacion;
import com.jcell.guia.services.GuiaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/guia")
public class GuiaControllers {
    //@Autowired
    GuiaServices guiaServices;

    @GetMapping(path = "/info")
    public Informacion getInformacion(){

        Informacion informacion = new Informacion();
        informacion.setCedula(17286156);
        informacion.setApellido("camacaro");
        informacion.setNombre("jesus");
        informacion.setNombre("david");

        Direccion direccion =new Direccion();
        direccion.setDireccion("Hoyo de la puerta");
        informacion.setDireccion(direccion);
        return informacion;
    }

    @PostMapping(path = "/info")
    public ArrayList<Informacion> crearInformacion(@RequestBody Informacion crear){
        return guiaServices.crearInformacion(crear);
    }



}
