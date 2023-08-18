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

