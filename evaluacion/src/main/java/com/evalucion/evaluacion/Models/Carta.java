package com.evalucion.evaluacion.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@Document(collection = "carta")
public class Carta {

    private Long id;
    private String nombreCarta;
    private String categoria;
    private Integer cantidad;

    private List<Plato> platoList;

}
