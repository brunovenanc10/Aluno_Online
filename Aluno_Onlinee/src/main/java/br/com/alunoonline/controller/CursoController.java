package br.com.alunoonline.api.controllers;

import br.com.alunoonline.dtos.CursoRequestDTO;
import br.com.alunoonline.dtos.CursoResponseDTO;
import br.com.alunoonline.services.CursoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<CursoResponseDTO> index() {
        return cursoService.index();
    }

    @GetMapping("/{id}")
    public CursoResponseDTO findById(@PathVariable Long id) {
        return cursoService.findById(id);
    }

    @PostMapping
    public ResponseEntity<CursoResponseDTO> create(@Valid @RequestBody CursoRequestDTO cursoDTO) {
        return ResponseEntity.status(201).body(cursoService.create(cursoDTO));
    }

    @PutMapping("/{id}")
    public CursoResponseDTO update(@Valid @RequestBody CursoRequestDTO cursoDTO, @PathVariable Long id) {
        return cursoService.update(id, cursoDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        cursoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
