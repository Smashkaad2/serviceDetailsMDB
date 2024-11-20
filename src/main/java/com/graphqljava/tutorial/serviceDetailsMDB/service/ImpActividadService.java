package com.graphqljava.tutorial.serviceDetailsMDB.service;

import org.springframework.stereotype.Service;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.Actividad;
import com.graphqljava.tutorial.serviceDetailsMDB.repository.ActividadRepository;


@Service
public class ImpActividadService extends ImpServicioService<Actividad> implements IActividadService {
    
    public ImpActividadService(ActividadRepository actividadRepository){
        super(actividadRepository);
    }
}

