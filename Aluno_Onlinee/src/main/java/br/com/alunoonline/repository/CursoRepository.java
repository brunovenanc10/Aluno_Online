package br.com.alunoonline.repository;

import br.com.alunoonline.model.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Long> {
}
