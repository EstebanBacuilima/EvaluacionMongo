package com.evalucion.evaluacion.Services;

import com.evalucion.evaluacion.Models.Cliente;
import com.evalucion.evaluacion.Respositorys.EntidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EntidadServiceImpl extends GenericServiceImpl<Cliente, Long> implements EntidadService {

    @Autowired
    EntidadRepository entidadRepository;
    @Override
    public CrudRepository<Cliente, Long> getDao() {
        return entidadRepository;
    }
}