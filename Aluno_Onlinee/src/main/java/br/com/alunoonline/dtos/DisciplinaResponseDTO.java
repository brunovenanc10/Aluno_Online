package br.com.dtos;

import br.com.model.Disciplina;

public record DisciplinaResponseDTO(
        Long id,
        String nome,
        Integer cargaHoraria,
        Long professorId,
        String nomeProfessor
) {
    public static DisciplinaResponseDTO fromEntity(Disciplina disciplina) {
        return new DisciplinaResponseDTO(
                disciplina.getId(),
                disciplina.getNome(),
                disciplina.getCargaHoraria(),
                disciplina.getProfessor().getId(),
                disciplina.getProfessor().getNome()
        );
    }
}