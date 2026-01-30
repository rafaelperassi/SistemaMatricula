# Sistema de Matrículas – API REST (Spring Boot)

Este projeto foi desenvolvido como atividade prática da disciplina de **Fullstack**, com o objetivo de aplicar os conceitos iniciais de **API REST utilizando Java e Spring Boot**.

O sistema permite:

* Cadastro de alunos
* Cadastro de cursos
* Matrícula de alunos em cursos via API

Toda a interação com o sistema é feita **exclusivamente por API**, utilizando a ferramenta **Insomnia** para testes.

---

## Tecnologias Utilizadas

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 / Banco configurado no projeto
* Maven
* Insomnia (para testes da API)

---

## Estrutura do Projeto

O projeto segue o padrão apresentado em aula, utilizando separação por camadas:

```
com.example.perassi
 ├── controllers   → Controllers da API
 ├── repositories  → Repositórios JPA
 └── models        → Entidades do sistema
```

---

## Conceito do Sistema

* Um **aluno** pode se matricular em **vários cursos**
* Um **curso** pode ter **vários alunos**
* Cada vínculo entre aluno e curso gera uma **nova matrícula**

Para isso, foi criada a entidade **Matricula**, que representa a relação entre **Aluno** e **Curso**.

---

## Como executar o projeto

1. Abra o projeto no **NetBeans**
2. Execute a classe:

   ```
   PerassiApplication.java
   ```
3. Aguarde a mensagem no console indicando que o servidor foi iniciado
4. A aplicação ficará disponível em:

   ```
   http://localhost:8080
   ```

---

## Testando a API com Insomnia

### Cadastrar Aluno

* **POST** `/aluno`

```json
{
  "nome": "Rafael"
}
```

---

### Cadastrar Curso

* **POST** `/curso`

```json
{
  "nome": "Java"
}
```

---

### Realizar Matrícula

* **POST** `/matricula?alunoId=1&cursoId=1`

> Não é necessário body, apenas os parâmetros na URL.

---

### Listar Matrículas

* **GET** `/matricula`

---

## Resultados Esperados

* O sistema permite cadastrar alunos e cursos
* Um aluno pode ser matriculado em mais de um curso
* Um curso pode conter vários alunos
* Cada matrícula é registrada individualmente

---

## Aprendizados

Com este projeto foi possível praticar:

* Criação de APIs REST
* Uso de Controllers, Models e Repositories
* Relacionamentos entre entidades no Spring Data JPA
* Testes de API utilizando o Insomnia

---

## Autores

Rafael Zanchetta Perassi - 161134
Gabriel Hiro Furukawa - 223190


