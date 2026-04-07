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



<img width="1109" height="611" alt="Screenshot_70" src="https://github.com/user-attachments/assets/7c05a531-6111-4453-9823-7f9dd9f9b994" />
<img width="1109" height="494" alt="Screenshot_69" src="https://github.com/user-attachments/assets/92fefd6e-8561-475d-bf0e-3cf5d6f12079" />
<img width="811" height="366" alt="Screenshot_80" src="https://github.com/user-attachments/assets/38e33cc3-1dae-4e01-991a-25df245ac00e" />
<img width="1109" height="362" alt="Screenshot_79" src="https://github.com/user-attachments/assets/5c0af739-e0f7-4564-a5e6-c185d71f4923" />
<img width="1109" height="497" alt="Screenshot_78" src="https://github.com/user-attachments/assets/9f3bd61d-6091-426f-991d-9d21cd4d833b" />
<img width="1109" height="508" alt="Screenshot_77" src="https://github.com/user-attachments/assets/dfdbe704-f1d8-48f8-8b9a-7136b34c49de" />
<img width="1100" height="658" alt="Screenshot_76" src="https://github.com/user-attachments/assets/ff135e52-0354-43ef-bcf2-eee886593615" />
<img width="1109" height="615" alt="Screenshot_74" src="https://github.com/user-attachments/assets/115e0b83-8117-4e06-bc3f-740817ccf156" />
<img width="1109" height="495" alt="Screenshot_73" src="https://github.com/user-attachments/assets/447deff8-2085-4675-8207-681439b06826" />
<img width="1109" height="497" alt="Screenshot_72" src="https://github.com/user-attachments/assets/ac396254-9ad3-4bef-be4a-de43fbce1d57" />
<img width="1109" height="496" alt="Screenshot_71" src="https://github.com/user-attachments/assets/e2355852-f0a8-430c-8228-4c6a8bb164ff" />


```md
![Insomnia](docs/imagens/exemplo.png)
```
