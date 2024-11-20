package com.graphqljava.tutorial.serviceDetailsMDB.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.Voluntariado;

@Repository
public interface VoluntariadoRepository extends ServicioRepository<Voluntariado>{
    List<Voluntariado> findByNombre(String nombre);
}

