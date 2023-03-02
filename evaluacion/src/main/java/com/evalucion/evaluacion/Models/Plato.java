package com.evalucion.evaluacion.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "plato")
public class Plato {

    private Long id;
    private String nombrePlato;
    private String descripcion;
    private Double precio;

}
