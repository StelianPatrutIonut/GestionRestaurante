package com.stelian.GestionRestaurante.GestionRestaurante.service;

import com.stelian.GestionRestaurante.GestionRestaurante.model.Mesa;

import java.util.concurrent.ConcurrentHashMap;

public class MesasService implements IMesasService{
    private static ConcurrentHashMap<Integer, Mesa> datosMesa = new ConcurrentHashMap<>();


}
