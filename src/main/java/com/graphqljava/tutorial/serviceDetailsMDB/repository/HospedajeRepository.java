package com.graphqljava.tutorial.serviceDetailsMDB.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.Hospedaje;

@Repository
public interface HospedajeRepository extends ServicioRepository<Hospedaje> {
    List<Hospedaje> findByNombre(String nombre);
}
