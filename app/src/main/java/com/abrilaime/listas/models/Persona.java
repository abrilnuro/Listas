package com.abrilaime.listas.models;

import android.widget.ImageView;

/**
 * Created by aimew on 18/09/2016.
 */
public class Persona {

    private String nombre;
    private String edad;
    private String ciudad;
    private int imagen;


    //constructor
    public Persona(String nombre, String edad, String ciudad, int imagen) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.imagen = imagen;
    }

    //getters and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
