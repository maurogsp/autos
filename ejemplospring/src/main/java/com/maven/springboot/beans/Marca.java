package com.maven.springboot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mauro on 29/05/17.
 */
@Service(value="marca")
public class Marca {
    private String descripcion;

    @Autowired
    public Marca()
    {
        this.setDescripcion("ford");
    }

    public Marca (String d)
    {
        this.descripcion = d;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
