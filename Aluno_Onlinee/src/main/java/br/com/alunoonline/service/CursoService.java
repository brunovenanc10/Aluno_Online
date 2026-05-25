package br.com.alunoonline.services;

import br.com.alunoonline.dtos.CursoRequestDTO;
import br.com.alunoonline.dtos.CursoResponseDTO;
import br.com.alunoonline.model.Curso;
import br.com.alunoonline.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class CursoService {
    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<CursoResponseDTO> index() {
        return StreamSupport.stream(cursoRepository.findAll().spliterator(), false)
                .map(CursoResponseDTO::fromEntity)
                .toList();
    }

    public CursoResponseDTO findById(Long id) {
        return CursoResponseDTO.fromEntity(findEntityById(id));
    }

    public CursoResponseDTO create(CursoRequestDTO cursoDTO) {
        Curso curso = new Curso();
        copyDtoToEntity(cursoDTO, curso);

        return CursoResponseDTO.fromEntity(cursoRepository.save(curso));
    }

    public CursoResponseDTO update(Long id, CursoRequestDTO cursoDTO) {
        Curso cursoExistente = findEntityById(id);
        copyDtoToEntity(cursoDTO, cursoExistente);

        return CursoResponseDTO.fromEntity(cursoRepository.save(cursoExistente));
    }

    public void delete(Long id) {
        findEntityById(id);
        cursoRepository.deleteById(id);
    }

    private Curso findEntityById(Long id) {
        return cursoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Curso nao encontrado para o id " + id));
    }

    private void copyDtoToEntity(CursoRequestDTO cursoDTO, Curso curso) {
        curso.setNome(cursoDTO.nome());
        curso.setCodigo(cursoDTO.codigo());
        curso.setCargaHoraria(cursoDTO.cargaHoraria());
        curso.setDescricao(cursoDTO.descricao());
    }
}
