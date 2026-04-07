package br.com.alunoonline.controller;

import br.com.alunoonline.model.Aluno;
import br.com.alunoonline.repository.AlunoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    private final AlunoRepository alunoRepository;

    public AlunoController(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @GetMapping
    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Aluno buscarPorId(@PathVariable Long id) {
        return alunoRepository.findById(id).orElseThrow();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Aluno criar(@RequestBody Aluno aluno) {
        aluno.setId(null);
        return alunoRepository.save(aluno);
    }

    @PutMapping("/{id}")
    public Aluno atualizar(@PathVariable Long id, @RequestBody Aluno aluno) {
        Aluno alunoExistente = alunoRepository.findById(id).orElseThrow();
        alunoExistente.setNome(aluno.getNome());
        alunoExistente.setMatricula(aluno.getMatricula());
        alunoExistente.setEmail(aluno.getEmail());
        alunoExistente.setCurso(aluno.getCurso());
        return alunoRepository.save(alunoExistente);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long id) {
        alunoRepository.deleteById(id);
    }
}
