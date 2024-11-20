package com.graphqljava.tutorial.serviceDetailsMDB.service;

import org.springframework.stereotype.Service;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.Voluntariado;
import com.graphqljava.tutorial.serviceDetailsMDB.repository.VoluntariadoRepository;

@Service
public class ImpVoluntariadoService extends ImpServicioService<Voluntariado> implements IVoluntariadoService {

    public ImpVoluntariadoService(VoluntariadoRepository voluntariadoRepository){
        super(voluntariadoRepository);
    }
}

