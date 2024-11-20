package com.graphqljava.tutorial.serviceDetailsMDB.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.Calificacion;

@Repository
public interface CalificacionRepository extends JpaRepository<Calificacion, Long> {
    List<Calificacion> findByServicio_IdServicio(Long servicioId);
     List<Calificacion> findByNombre(String nombre);
    
}