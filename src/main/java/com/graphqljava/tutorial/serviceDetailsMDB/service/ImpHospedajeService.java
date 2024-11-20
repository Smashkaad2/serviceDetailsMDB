package com.graphqljava.tutorial.serviceDetailsMDB.service;

import org.springframework.stereotype.Service;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.Hospedaje;
import com.graphqljava.tutorial.serviceDetailsMDB.repository.HospedajeRepository;

@Service
public class ImpHospedajeService extends ImpServicioService<Hospedaje> implements IHospedajeService {
    
    public ImpHospedajeService(HospedajeRepository hospedajeRepository){
        super(hospedajeRepository);
    }
}
