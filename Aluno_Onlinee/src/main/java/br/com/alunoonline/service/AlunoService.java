package br.com.alunoonline.service;

import br.com.alunoonline.model.Aluno;
import br.com.alunoonline.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }

    public Aluno buscarPorId(Long id) {
        return alunoRepository.findById(id).orElseThrow();
    }

    public Aluno criar(Aluno aluno) {
        aluno.setId(null);
        return alunoRepository.save(aluno);
    }

    public Aluno atualizar(Long id, Aluno aluno) {
        Aluno alunoExistente = buscarPorId(id);
        alunoExistente.setNome(aluno.getNome());
        alunoExistente.setMatricula(aluno.getMatricula());
        alunoExistente.setEmail(aluno.getEmail());
        alunoExistente.setCurso(aluno.getCurso());
        return alunoRepository.save(alunoExistente);
    }

    public void deletar(Long id) {
        alunoRepository.deleteById(id);
    }
}
