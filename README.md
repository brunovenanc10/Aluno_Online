# Aluno Online API

Projeto Spring Boot com CRUD completo de aluno e professor.

## Explicacao do projeto

A API permite cadastrar, listar, buscar por id, atualizar e excluir alunos e professores.

## Detalhamento do codigo

- `model`: entidades `Aluno` e `Professor`
- `repository`: acesso ao banco com Spring Data JPA
- `controller`: endpoints REST para os CRUDs

## Arquitetura utilizada

Arquitetura simples em 3 camadas:

- `controller`
- `repository`
- `model`

## Como executar

Pre-requisitos:

- Java 17
- Maven

Comando:

```bash
mvn spring-boot:run
```

Aplicacao em `http://localhost:8080`.

## Endpoints

### Aluno

- `POST /api/alunos`
- `GET /api/alunos`
- `GET /api/alunos/{id}`
- `PUT /api/alunos/{id}`
- `DELETE /api/alunos/{id}`

Exemplo:

```json
{
  "nome": "Ana Silva",
  "matricula": "2024001",
  "email": "ana@email.com",
  "curso": "Sistemas de Informacao"
}
```

### Professor

- `POST /api/professores`
- `GET /api/professores`
- `GET /api/professores/{id}`
- `PUT /api/professores/{id}`
- `DELETE /api/professores/{id}`

Exemplo:

```json
{
  "nome": "Carlos Souza",
  "email": "carlos@email.com",
  "disciplina": "Banco de Dados",
  "registro": "PROF-001"
}
```

## Banco de dados

Banco H2 em arquivo local:

- URL: `jdbc:h2:file:./data/aluno-online-db`
- Usuario: `sa`
- Senha: em branco

## Prints obrigatorios





```md
![Insomnia](docs/imagens/exemplo.png)
```
