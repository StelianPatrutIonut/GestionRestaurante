package com.stelian.GestionRestaurante.GestionRestaurante.model;

public class Mesa {
    private int id;
    private int numSillas;

    public Mesa(){

    }
    public Mesa(int id, int numSillas) {
        this.id = id;
        this.numSillas = numSillas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumSillas() {
        return numSillas;
    }

    public void setNumSillas(int numSillas) {
        this.numSillas = numSillas;
    }
}
