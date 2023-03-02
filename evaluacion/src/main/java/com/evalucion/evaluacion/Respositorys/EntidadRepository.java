package com.evalucion.evaluacion.Respositorys;

import com.evalucion.evaluacion.Models.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EntidadRepository extends MongoRepository<Cliente, Long> {
}
