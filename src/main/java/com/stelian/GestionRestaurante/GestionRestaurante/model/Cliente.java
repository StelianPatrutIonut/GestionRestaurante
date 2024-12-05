package com.stelian.GestionRestaurante.GestionRestaurante.model;

public class Cliente {
    private String nombre;
    private String apellido;
    private int numTelefono;
    public Cliente(){

    }

    public Cliente(String nombre, String apellido, int numTelefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numTelefono = numTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }
}
