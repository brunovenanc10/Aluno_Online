package br.com.alunoonline.service;

import br.com.alunoonline.model.Professor;
import br.com.alunoonline.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<Professor> listarTodos() {
        return professorRepository.findAll();
    }

    public Professor buscarPorId(Long id) {
        return professorRepository.findById(id).orElseThrow();
    }

    public Professor criar(Professor professor) {
        professor.setId(null);
        return professorRepository.save(professor);
    }

    public Professor atualizar(Long id, Professor professor) {
        Professor professorExistente = buscarPorId(id);
        professorExistente.setNome(professor.getNome());
        professorExistente.setEmail(professor.getEmail());
        professorExistente.setDisciplina(professor.getDisciplina());
        professorExistente.setRegistro(professor.getRegistro());
        return professorRepository.save(professorExistente);
    }

    public void deletar(Long id) {
        professorRepository.deleteById(id);
    }
}
