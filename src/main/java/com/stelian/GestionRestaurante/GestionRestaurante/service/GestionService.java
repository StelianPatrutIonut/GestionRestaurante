package com.stelian.GestionRestaurante.GestionRestaurante.service;

import com.stelian.GestionRestaurante.GestionRestaurante.model.Cliente;
import com.stelian.GestionRestaurante.GestionRestaurante.model.InfoGestion;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

public class GestionService implements IGestionService {
    private static ConcurrentHashMap<Integer, InfoGestion> datosReserva = new ConcurrentHashMap<>();


    @Override
    public void generarReservaFak(){
        Cliente cliente = new Cliente("Stelian","Patrut",662533929);

        InfoGestion reservaFake = new InfoGestion(1,1,cliente,12,15,7);
        datosReserva.put(reservaFake.getIndentificador(),reservaFake);
    }
    @Override
    public boolean nuevaReserva(InfoGestion reserva){
        datosReserva.put(reserva.getIndentificador(),reserva);
        return true;
    }
    @Override
    public Collection<InfoGestion>getReservas(){
        return  datosReserva.values();
    }
}
