# 🧩 Workshop Spring Boot com MongoDB

Projeto desenvolvido em **Java** utilizando **Spring Boot** e **MongoDB**, com o objetivo de consolidar os principais conceitos de **desenvolvimento backend**, **APIs RESTful** e **banco de dados NoSQL**.

Este projeto foi baseado no curso de **Nelio Alves**, aplicando práticas reais de modelagem de dados, serviços, repositórios e controle de rotas.

---

## ✨ Funcionalidades

O sistema simula um ambiente simples de **publicações de usuários**, semelhante a um pequeno blog, com as seguintes operações:

- 👤 **Usuários:** criação, listagem, busca por ID e exclusão.  
- 📝 **Postagens:** cada usuário pode criar posts com título, corpo e data.  
- 💬 **Comentários:** posts podem conter comentários de outros usuários.  
- 🔍 **Busca personalizada:** busca de postagens por título utilizando parâmetros dinâmicos na URL.  
- 🧱 **DTOs (Data Transfer Objects):** para trafegar dados de forma controlada entre camadas.  
- 🧩 **Padrão Repository e Service:** separação de responsabilidades e uso correto das camadas da aplicação.  
- 🌐 **API RESTful:** endpoints estruturados e documentados com boas práticas de REST.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **Spring Data MongoDB**
- **MongoDB Atlas / Local**
- **Maven** (gerenciador de dependências)
- **Postman** (para testar os endpoints)

---

## 📁 Estrutura do Projeto

```bash
src/
├── main/
│   ├── java/com/andrenunes/workshopmongo/
│   │   ├── config/          # Configurações de inicialização e seed do banco
│   │   ├── controller/      # Controladores REST
│   │   ├── domain/          # Entidades de domínio (User, Post, Comment)
│   │   ├── dto/             # Objetos de transferência de dados (DTOs)
│   │   ├── repository/      # Interfaces do MongoRepository
│   │   └── service/         # Lógica de negócio (camada de serviço)
│   └── resources/
│       ├── application.properties
│       └── ...
└── test/
```

---

## 🚀 Como Executar o Projeto

### Pré-requisitos

- **Java 17+**
- **Maven**
- **MongoDB** (local ou Atlas)
- IDE (IntelliJ, Eclipse ou VS Code)

### Passos

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/andrelsrn/workshop-spring-boot-mongodb.git
   cd workshop-spring-boot-mongodb
   ```

2. **Configure o MongoDB:**

   Se usar localmente, edite o arquivo `src/main/resources/application.properties`:

   ```properties
   spring.data.mongodb.uri=mongodb://localhost:27017/workshop_mongo
   ```

   Caso use o **MongoDB Atlas**, substitua pela sua URI de conexão.

3. **Execute o projeto:**

   ```bash
   mvn spring-boot:run
   ```

   Ou rode a classe principal manualmente:

   ```bash
   com.andrenunes.workshopmongo.WorkshopmongoApplication
   ```

4. **Acesse a aplicação:**

   ```
   http://localhost:8080
   ```

---

## 🔗 Endpoints Principais

| Método | Endpoint | Descrição |
|--------|-----------|------------|
| **GET** | `/users` | Lista todos os usuários |
| **GET** | `/users/{id}` | Busca um usuário por ID |
| **POST** | `/users` | Cria um novo usuário |
| **DELETE** | `/users/{id}` | Deleta um usuário |
| **GET** | `/posts/{id}` | Busca um post por ID |
| **GET** | `/posts/titlesearch?text=...` | Busca posts pelo título |
| **POST** | `/posts` | Cria um novo post |
| **GET** | `/posts/{id}/comments` | Lista comentários de um post |

---

## 🧩 Conceitos Aplicados

- Injeção de dependência com **@Autowired**
- Criação e uso de **Services** e **Repositories**
- Padrão **DTO** para resposta e requisição
- Tratamento de exceções com **@ControllerAdvice**
- Uso de **Optional** e **ResponseEntity**
- **Operações CRUD** completas com MongoDB
- **Relacionamento entre documentos** (User ↔ Post ↔ Comment)

---

## 🧠 Aprendizados

Durante o desenvolvimento, foram explorados:
- A integração entre Spring Boot e bancos NoSQL.
- O uso correto das camadas **Controller → Service → Repository**.
- A importância da imutabilidade e da separação de responsabilidades.
- Criação de endpoints REST seguindo boas práticas.

---

## 🤝 Autor

**André L. S. R. N.**  
📎 [GitHub Profile](https://github.com/andrelsrn)

---

## 📄 Licença

Este projeto está sob a licença [MIT License](https://opensource.org/licenses/MIT).
