package com.stelian.GestionRestaurante.GestionRestaurante;

import com.stelian.GestionRestaurante.GestionRestaurante.model.InfoGestion;
import com.stelian.GestionRestaurante.GestionRestaurante.service.IGestionService;
import com.stelian.GestionRestaurante.GestionRestaurante.service.IMesasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
@RestController
@RequestMapping("reserva/gestion-reserva")
public class ApiReserva {

    @Autowired
    public IGestionService gestionService;
    @Autowired
    public IMesasService mesasService;

    @PostMapping("/reserva")
    public ResponseEntity<Boolean>reservaFake(){
        gestionService.generarReservaFak();
        return new ResponseEntity<>(true, HttpStatus.OK);
    }
    @GetMapping("/mostrar-reservas")
    public ResponseEntity<Collection<InfoGestion>>todasReservas(){
        Collection<InfoGestion>reservas = gestionService.getReservas();
        if (reservas.isEmpty()){
            return new ResponseEntity<>(reservas, HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(reservas, HttpStatus.OK);
        }
    }
}
