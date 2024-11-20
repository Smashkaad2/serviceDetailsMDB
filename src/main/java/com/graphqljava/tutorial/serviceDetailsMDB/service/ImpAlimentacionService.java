package com.graphqljava.tutorial.serviceDetailsMDB.service;

import org.springframework.stereotype.Service;

import com.graphqljava.tutorial.serviceDetailsMDB.entity.Alimentacion;
import com.graphqljava.tutorial.serviceDetailsMDB.repository.AlimentacionRepository;



@Service
public class ImpAlimentacionService extends ImpServicioService<Alimentacion> implements IAlimentacionService{

    public ImpAlimentacionService(AlimentacionRepository alimentacionRepository){
        super(alimentacionRepository);
    }
}
