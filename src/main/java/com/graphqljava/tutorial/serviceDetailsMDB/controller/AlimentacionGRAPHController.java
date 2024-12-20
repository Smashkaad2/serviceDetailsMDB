package com.graphqljava.tutorial.serviceDetailsMDB.controller;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.Alimentacion;
import com.graphqljava.tutorial.serviceDetailsMDB.service.IAlimentacionService;
import com.graphqljava.tutorial.serviceDetailsMDB.entity.EstadoServicio;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AlimentacionGRAPHController {

    private final IAlimentacionService alimentacionService;

    public AlimentacionGRAPHController(IAlimentacionService alimentacionService) {
        this.alimentacionService = alimentacionService;
    }

    @QueryMapping
    public List<Alimentacion> obtenerAlimentaciones() {
        return alimentacionService.obtenerServiciosPorEstado(EstadoServicio.DISPONIBLE);
    }

    @QueryMapping
    public Alimentacion obtenerAlimentacionPorId(@Argument Long id) {
        return alimentacionService.obtenerServiciosPorId(id);
    }

    @QueryMapping
    public List<Alimentacion> obtenerAlimentacionesPorNombre(@Argument String nombre) {
        return alimentacionService.obtenerServiciosPorNombre(nombre);
    }
}
