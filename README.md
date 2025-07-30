# 📝 TaskBoard - Gerenciador de Tarefas com Spring Boot

Projeto de board de tarefas desenvolvido com **Spring Boot**, **JPA**, **Flyway**, **H2 Database** e arquitetura em camadas. Ideal para praticar conceitos de APIs REST, camadas DAO/Service/Controller, persistência com JPA e integração com banco de dados via migrations.

---

## 🚀 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot 3.5+**
  - Spring Web
  - Spring Data JPA
  - Spring Validation
- **H2 Database (memória)**
- **Flyway (migrations)**
- **Lombok**
- **Maven**
- **Postman / cURL (para testes)**

---

## 📐 Arquitetura

```plaintext
com.example.taskboard
│
├── controller     # Camada de exposição da API (REST Controllers)
├── dto            # Data Transfer Objects (request/response)
├── entity         # Entidades JPA
├── repository     # Camada DAO (Spring Data JPA)
├── service        # Lógica de negócio
├── exception      # Tratamento global de erros
├── config         # Configurações (se necessário)
└── TaskBoardApplication.java

git clone https://github.com/seu-usuario/taskboard.git
cd taskboard

./mvnw spring-boot:run


curl -X POST http://localhost:8080/api/tasks \
  -H "Content-Type: application/json" \
  -d '{
    "title": "Estudar Spring Boot",
    "description": "Revisar JPA e testes unitários"
}'

👨‍💻 Autor
Alves - Desenvolvedor de Sistemas