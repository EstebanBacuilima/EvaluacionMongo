package com.evalucion.evaluacion.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@Document(collection = "cliente")
public class Cliente {

    private Long id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;

    private List<Restaurante> restauranteList;

}
