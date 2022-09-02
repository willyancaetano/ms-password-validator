
# ms-password-validator

API responsável por validar regras de complexidade de uma senha.

## Como executar

### Ferramentas
- Maven 3.8.6
- Java 17

### Executar a aplicação
Executar via command-line

    mvn spring-boot:run

### Testar a aplicação
Via CURL

    curl -X POST http://localhost:8080/v1/passwords/validations -H "Content-Type: application/json" -d '{"value": "AbTp9!fok"}'

## Decisões técnicas

### Spring Boot

Foi utilizado o Spring Boot para acelerar o processo de desenvolvimento, configuração e criação da API Web. Além disso,  em um cenário real dado a vasta documentação e utilização do Spring e suas features o desenvolvimento de novas funcionalidades e resolução de problemas é facilitado.

### Testes de integração

Tendo em vista que o escopo do problema e a feature são muito bem definidos fez mais sentido validar o comportamento esperado pela aplicação através de testes de integração.

### REST

A API Web foi feita respeitando as recomendações dos padrões REST.

### Design da aplicação

A aplicação em relação a seu design utilizou:

- Separação em camadas para segregar a responsabilidade das classes através de pacotes (api, dto, service, controller);
- Utilização do Design Pattern [Chain of Responsability](https://refactoring.guru/pt-br/design-patterns/chain-of-responsibility) para separar as responsabilidades de validação de cada uma das regras definidas nos requisitos;

