package br.com.dtos;

import java.util.List;

public record HistoricoAlunoResponseDTO(
        String nomeAluno,
        String emailAluno,
        String cpfAluno,
        List<DisciplinaHistoricoResponseDTO> disciplinas
) {
}