# SpringBootAPIProject
API desenvolvida com java Spring Boot. Atualmente a API utiliza o banco de dados postgres para persistência de dados, há também proteção de rotas utilizando JWT. 

## Recursos utilizados
* Java 8
* Maven
* VsCode
* Spring Boot
  * Spring boot data JPA
  * Spring boot starter security
  * Spring boot security oauth2 autoconfigure
* PostgreSql

## Executando o projeto
Primeiramente, você deve ter todo o ambiente configurado para rodar uma aplicação Spring boot, juntamente com o postgressql instalado, e o servidor do postgres iniciado na porta 5432. esse [Link](https://code.visualstudio.com/docs/java/java-spring-boot) informa como configurar e executar uma aplicação spring utilizando VsCode. Com todo o ambiente configurado, você pode executar a aplicação na parte do spring-Boot-Dashboard no vscode.   

### EndPoints

* GET http://localhost:8000/pessoa - Lista todas as pessoas cadastradas. 
* GET http://localhost:8000/pessoa/{id} - Lista a pessoa cadastrada pelo id informado. 
* POST http://localhost:8000/pessoa - cadastra/insere uma pessoa.
* PUT http://localhost:8000/pessoa/{id} - atualiza dados de uma pessoa. 
* DELETE http://localhost:8000/pessoa/{id} - deleta uma pessoa. 


## Meta
Emanuel Silva – emanuelborgesdasilva@gmail.com

Distribuído sob MIT License. Veja [LICENSE.md](LICENSE) para mais informações.

