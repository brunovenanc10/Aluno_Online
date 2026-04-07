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


<img width="1109<img<<img width="1109" h<img width="1109" height="508" alt="Screenshot_77" src="https://github.com/user-attachments/assets/054f116e-ee7c-463d-b613-43cecc4d2ec5" />
eight="497" alt="Screenshot_78" src="https://github.com/user-attachments/assets/98a42659-d1d3-4e51-b3c7-6ea657965e7f" />
img width="1109" height="495" alt="Screenshot_73" src="https://githu<img width="1100" height="658" alt="Screenshot_76" src="https://github.com/user-attachments/assets/9e0<img width="1109" height="508" alt="Screenshot_77" src="https://github.com/user-attachments/assets/11a97c63-ee5c-4d2c-a316-4b0e038b29d5" />
9570a-dd23-4a12-943f-1bf6b5c2f2f2" />
b.com/user-attachments/asse<img width="1109" height="615" alt="Screenshot_74" src="https://github.com/user-attachments/assets/e712fc92-2c87-47f6-be59-08b74da3eabd" />
ts/33ce739b-6849-4cb7-8a1d-5cb23f739ad6" />
 width="1109" height="496" alt="Screenshot_71" src="https://github.com/user-attachments/assets/880f7a81-12fc-418c-b414-0ed1a62e7f76" />
"<img width="1109" height="611" alt="Screenshot_70" src="https://github.com/user-attachments/assets/b91774e1-c7c3-4e5c-8f34-7779ee0e8064" />
 height="494" alt="Screenshot_69" src="https://github.com/user-attachments/assets/12cc8dda-dbaf-48d6-b74f-22a183f30f7b" />
<img width="1109" height="497" alt="Screenshot_78" src="https://github.com/user-attachments/assets/a5319504-107f-4447-9602-ad9fdf9c4d45" />
<img width="1109" height="362" alt="Screenshot_79" src="https://github.com/user-attachments/assets/03118b44-2d63-4c82-a59f-7e01e69a384d" />

Exemplo de imagem:<img width="811" height="366" alt="Screenshot_80" src="https://github.com/user-attachments/assets/f9475a8f-ec60-48c0-8521-f37c53d19da4" />


```md
![Insomnia](docs/imagens/exemplo.png)
```
