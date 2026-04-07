package br.com.alunoonline.controller;

import br.com.alunoonline.model.Professor;
import br.com.alunoonline.repository.ProfessorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/professores")
public class ProfessorController {

    private final ProfessorRepository professorRepository;

    public ProfessorController(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    @GetMapping
    public List<Professor> listarTodos() {
        return professorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Professor buscarPorId(@PathVariable Long id) {
        return professorRepository.findById(id).orElseThrow();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Professor criar(@RequestBody Professor professor) {
        professor.setId(null);
        return professorRepository.save(professor);
    }

    @PutMapping("/{id}")
    public Professor atualizar(@PathVariable Long id, @RequestBody Professor professor) {
        Professor professorExistente = professorRepository.findById(id).orElseThrow();
        professorExistente.setNome(professor.getNome());
        professorExistente.setEmail(professor.getEmail());
        professorExistente.setDisciplina(professor.getDisciplina());
        professorExistente.setRegistro(professor.getRegistro());
        return professorRepository.save(professorExistente);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long id) {
        professorRepository.deleteById(id);
    }
}
