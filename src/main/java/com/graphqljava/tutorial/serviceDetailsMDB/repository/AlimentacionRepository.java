package com.graphqljava.tutorial.serviceDetailsMDB.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.Alimentacion;



@Repository
public interface AlimentacionRepository extends ServicioRepository<Alimentacion>{
    List<Alimentacion> findByNombre(String nombre);
}
