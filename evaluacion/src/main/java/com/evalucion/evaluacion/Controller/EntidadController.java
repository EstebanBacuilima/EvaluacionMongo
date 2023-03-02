package com.evalucion.evaluacion.Controller;

import com.evalucion.evaluacion.Models.Cliente;
import com.evalucion.evaluacion.Services.EntidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class EntidadController {

    @Autowired
    EntidadService entidadService;

    @GetMapping("/listar")
    public ResponseEntity<List<Cliente>> ListarTodos() {
        return new ResponseEntity<>(entidadService.findByAll(),
                HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Cliente> Creas(
            @RequestBody Cliente p) {
        return new ResponseEntity<>(entidadService.save(p),
                HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Cliente> eliminar(@PathVariable Long id) {
        entidadService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Cliente> Actualizar(@PathVariable Long id, @RequestBody Cliente p) {
        Cliente personaENcontrada = entidadService.findById(id);
        if (personaENcontrada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                personaENcontrada.setNombre(p.getNombre());
                personaENcontrada.setApellido(p.getApellido());
                personaENcontrada.setCorreo(p.getCorreo());
                return new ResponseEntity<>(entidadService.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }


}
