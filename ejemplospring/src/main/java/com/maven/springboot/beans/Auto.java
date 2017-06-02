package com.maven.springboot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mauro on 29/05/17.
 */
@Service(value="auto")
public class Auto {
    private Marca marca;
    private String modelo;
    private int kilometros;
    private String patente;
    private int anio;


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Autowired
    public Auto (Marca marquita)
    {
        this.setMarca(marquita);
        this.modelo = "full";
        this.setKilometros(5000);
        this.setPatente("aec123");
        this.setAnio(2017);

    }

    public Auto (Marca m, String mod, int km, String p, int a )
    {
        this.marca = m;
        this.modelo = mod;
        this.setKilometros(km);
        this.setPatente(p);
        this.setAnio(a);
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
