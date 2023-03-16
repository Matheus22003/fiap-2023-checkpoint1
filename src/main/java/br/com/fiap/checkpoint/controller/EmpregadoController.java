package br.com.fiap.checkpoint.controller;

import br.com.fiap.checkpoint.model.Empregado;
import br.com.fiap.checkpoint.service.EmpregadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/empregados")
public class EmpregadoController {
    @Autowired
    private EmpregadoService empregadoService;

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void postMapping(@RequestBody Empregado empregado) {
        empregadoService.save(empregado);
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Empregado>> listAll() {
        return ok(empregadoService.listAll());
    }

    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Empregado> findByCodigoEmpregado(@PathVariable Long id) {
        return ok(empregadoService.getById(id));
    }

    @PutMapping(consumes = APPLICATION_JSON_VALUE)
    public void putMapping(@RequestBody Empregado empregado) {
        empregadoService.update(empregado);
    }

    @DeleteMapping("/{id}")
    public void deleteMapping(@PathVariable Long id) {
        empregadoService.delete(id);
    }
}
