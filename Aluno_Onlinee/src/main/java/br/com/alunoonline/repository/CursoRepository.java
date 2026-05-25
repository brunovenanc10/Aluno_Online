package br.com.alunoonline.repositories;

import br.com.alunoonline.models.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Long> {
}
