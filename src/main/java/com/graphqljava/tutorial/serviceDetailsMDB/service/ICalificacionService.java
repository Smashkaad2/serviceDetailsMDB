package com.graphqljava.tutorial.serviceDetailsMDB.service;

import java.util.List;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.Calificacion;



public interface ICalificacionService {
    Calificacion crearCalificacion(Calificacion calificacion);
    Calificacion actualizarCalificacion(Long id, Calificacion calificacion);
    void eliminarCalificacion(Long id);
    Calificacion obtenerCalificacionPorId(Long id);
    List<Calificacion> obtenerCalificacionesPorServicio(Long servicioId);
    double calcularPromedioCalificaciones(Long servicioId);
}
