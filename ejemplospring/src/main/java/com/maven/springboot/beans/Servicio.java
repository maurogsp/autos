package com.maven.springboot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mauro on 31/05/17.
 */
@Service (value="servicio")
public class Servicio {
    @Autowired
    Dao coleccion;

    @Autowired
    public Servicio()
    {

    }

    public List getautos()
    {
        return coleccion.getLista();
    }

    public Auto getautoxid(String id)
    {
        return coleccion.getelementoxid(id);
    }

    public Auto getautoxmarca (String d)
    {
        return coleccion.getautoxmarca(d);
    }

}
