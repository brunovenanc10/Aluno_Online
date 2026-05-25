package br.com.dtos;

import br.com.model.Professor;

public record ProfessorResponseDTO(
        Long id,
        String nome,
        String email,
        String cpf,
        String especialidade,
        String titulacao
) {
    public static ProfessorResponseDTO fromEntity(Professor professor) {
        return new ProfessorResponseDTO(
                professor.getId(),
                professor.getNome(),
                professor.getEmail(),
                professor.getCpf(),
                professor.getEspecialidade(),
                professor.getTitulacao()
        );
    }
}