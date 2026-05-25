package br.com.alunoonline.service;
import br.com.alunoonline.model.Disciplina;
import br.com.alunoonline.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisciplinaService {
    @Autowired
    DisciplinaRepository disciplinaRepository;

    public void criarDisciplina(Disciplina disciplina){
            disciplinaRepository.save(disciplina);
    }
}
