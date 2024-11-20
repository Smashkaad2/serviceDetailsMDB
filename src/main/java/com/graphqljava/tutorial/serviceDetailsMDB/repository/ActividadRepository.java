package com.graphqljava.tutorial.serviceDetailsMDB.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.Actividad;

@Repository
public interface ActividadRepository extends ServicioRepository<Actividad>{
    List<Actividad> findByNombre(String nombre);
}

