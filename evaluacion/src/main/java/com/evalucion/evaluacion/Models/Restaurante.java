package com.evalucion.evaluacion.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@Document(collection = "resturante")
public class Restaurante {

    private Long id;
    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;

    private List<Carta> cartaList;

}
