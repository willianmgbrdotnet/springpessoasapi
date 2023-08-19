# SpringBoot API 
<li> API que interage com a tabela pessoas do banco de dados.</li>
CREATE TABLE `pessoas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Nome` varchar(50) DEFAULT NULL,
  `Sexo` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`)); 
INSERT INTO `pessoas` VALUES (1,'Cynde Alesbrook','F'),(2,'Vinson Jiroutka','M');

## Adicionada as dependências:
<li>Spring Data JPA</li>

<li>MySQL Driver</li>

<li>Spring Web</li>

## Configuração da ConnectionString em 'application.properties' 

## Classe Pessoa criada na pasta Entity
<li>Setar as notações que mapeam a entidade com a tabela do banco de dados

## Para que o springboot gere automaticamente as rotas REST, deve-se instalar a dependência 'Rest Repositories'. 

### E então criar um repositório para a entidade que extends JpaRepository<'NomeDaEntidade', 'tipoDoId'> {} 

### Para que isso funcione, é preciso setar a notação @RepositoryRestResource no Repositório.

## Para acessar os métodos REST da Entidade, basta colocar /'nomeDaTabela' depois da porta e fazer os testes no Postman.

## A api está funcionando. O proximo passo é personalizar os resultados de erro e sucesso.