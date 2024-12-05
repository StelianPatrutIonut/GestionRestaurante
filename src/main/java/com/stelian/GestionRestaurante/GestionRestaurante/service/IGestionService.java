package com.stelian.GestionRestaurante.GestionRestaurante.service;

import com.stelian.GestionRestaurante.GestionRestaurante.model.InfoGestion;

import java.util.Collection;

public interface IGestionService {

    void generarReservaFak();

    boolean nuevaReserva(InfoGestion reserva);

    Collection<InfoGestion> getReservas();
}
