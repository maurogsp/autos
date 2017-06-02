package com.maven.springboot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mauro on 31/05/17.
 */
@Repository
public class Dao {
    private List<Auto> lista;

    @Autowired
    public Dao() {
        setLista(new ArrayList<Auto>());
        Auto auto1 = new Auto(new Marca("ford"), "Focus", 1000, "asd123", 2012);
        Auto auto2 = new Auto(new Marca("volkswagen"), "Gol", 2000, "qwe456", 2014);
        Auto auto3 = new Auto(new Marca("reanult"), "Capture", 5, "zzz111", 2017);
        getLista().add(auto1);
        getLista().add(auto2);
        getLista().add(auto3);

    }

    public List getLista() {
        return lista;
    }

    public void setLista(List lista) {
        this.lista = lista;
    }

    public Auto getelementoxid(String id) {
        Auto v = null;
        for (Auto a : lista) {
            if (id.equals(a.getPatente()))
                v=a;
        }
        return v;
    }

    public Auto getautoxmarca(String descripcion)
    {
        Auto v = null;
        for (Auto a : lista) {
            if (descripcion.equals(a.getMarca().getDescripcion()))
                v=a;
        }
        return v;
    }
}
