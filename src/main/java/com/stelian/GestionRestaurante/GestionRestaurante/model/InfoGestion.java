package com.stelian.GestionRestaurante.GestionRestaurante.model;


public class InfoGestion {
    private int indentificador;
    private int idMesa;
    private Cliente cliente;
    private int dia;
    private int hora;
    private int numComensales;

    public InfoGestion() {

    }
    public InfoGestion(int indentificador, int idMesa, Cliente cliente, int dia, int hora, int numComensales) {
        this.indentificador = indentificador;
        this.idMesa = idMesa;
        this.cliente = cliente;
        this.dia = dia;
        this.hora = hora;
        this.numComensales = numComensales;
    }

    public int getIndentificador() {
        return indentificador;
    }

    public void setIndentificador(int indentificador) {
        this.indentificador = indentificador;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getNumComensales() {
        return numComensales;
    }

    public void setNumComensales(int numComensales) {
        this.numComensales = numComensales;
    }
}
