# Book Store Management

Um projeto simples de gerenciamento de livraria desenvolvido com Spring Boot, MySQL e JPA.

## Como rodar o projeto

1-Clone o repositório do projeto Book Store do GitHub para o seu ambiente local

2-Crie uma conexão no Banco de Dados MySQL com as seguintes credenciais:
Nome do banco de dados: book
Usuário: root
Senha: root
Clique em OK para confirmar a conexão.
![image](https://github.com/louise-alonso/BookStore/assets/120966351/8496c501-b587-4572-aa52-fc81fe33dc46)

3-E por fim, entre no arquivo da classe BookStoreApllication para executar o projeto
![image](https://github.com/louise-alonso/BookStore/assets/120966351/91f27b09-27c2-445c-8f9b-ea2c92914291)

4- Se ocorrer um erro de porta (provavelmente porque a porta 8080 já está sendo usada), abra o CMD e execute os seguintes comandos :
netstat -ano | findstr :8080

-Isso mostrará o PID (Process ID) do processo que está usando a porta 8080

taskkill /PID <PID> /F

-Substitua <PID> pelo valor do número que apareceu no comando anterior. Isso encerrará o processo que está usando a porta 8080


## Tecnologias Utilizadas

- **Spring Boot**: Framework Java para construir aplicações web e microserviços.
- **MySQL**: Sistema de gerenciamento de banco de dados relacional.
- **Thymeleaf**: Motor de templates para renderização de páginas web em Java.
- **JPA (Java Persistence API)**: API para gerenciamento de persistência e mapeamento objeto-relacional.
  

## Colaboradores

- **Louise Alonso** (@louise-alonso) - Collaborator
- **Calvin Ribeiro** (@calvinribeiro) - Collaborator
- **Maria Fernanda** (@Mf3ernanda) - Collaborator
- **Tárcyla Kauane** (@tarcylakauane) - Collaborator

## Funcionalidades

- Cadastro de livros
- Listagem de livros
- Atualização de informações de livros
- Remoção de livros
