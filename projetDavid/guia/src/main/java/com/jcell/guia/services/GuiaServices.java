package com.jcell.guia.services;

import com.jcell.guia.models.Direccion;
import com.jcell.guia.models.Informacion;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GuiaServices {

    private ArrayList<Informacion> lista = new ArrayList();

    public ArrayList<Informacion> crearInformacion(Informacion newInformacion){
        lista.add(newInformacion);
        return lista;
    }


    {
        Informacion informacion = new Informacion();
        informacion.setCedula(17286156);
        informacion.setApellido("camacaro");
        informacion.setNombre("jesus");
        Direccion direccion =new Direccion();
        direccion.setDireccion("Hoyo de la puerta");
        informacion.setDireccion(direccion);
        lista.add(informacion);

        Informacion informacion2 = new Informacion();
        informacion2.setCedula(17286156);
        informacion2.setApellido("camacaro");
        informacion2.setNombre("jesus");
        Direccion direccion2 =new Direccion();
        direccion2.setDireccion("Hoyo de la puerta");
        informacion2.setDireccion(direccion2);
        lista.add(informacion2);

        Informacion informacion3 = new Informacion();
        informacion3.setCedula(172156);
        informacion3.setApellido("caro");
        informacion3.setNombre("sus");
        Direccion direccion3 =new Direccion();
        direccion3.setDireccion("Hoyo puerta");
        informacion3.setDireccion(direccion3);
        lista.add(informacion3);
    }


}
