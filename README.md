# Java Fundamentals

[Português](#português) | [English](#english)

## Português

Coleção organizada de exercícios acadêmicos e estudos independentes que documentam minha evolução com Java. Os exemplos originais foram revisados e refatorados para aplicar nomes descritivos, pacotes consistentes, separação de responsabilidades e testes automatizados.

### Conteúdos

- Fundamentos: entrada de dados, condicionais, métodos e operações matemáticas
- Algoritmos: busca linear, Fibonacci, fatorial, números primos e matrizes
- Codewars: nove katas refatorados com testes e links para os desafios originais
- Coleções: operações com ArrayList
- Orientação a objetos: encapsulamento, validação e modelagem de objetos
- Qualidade: Maven, JUnit 5 e integração contínua

### Estrutura

~~~text
src/
├── main/java/io/github/matheusapolo/javafundamentals/
│   ├── algorithms/
│   ├── collections/
│   ├── codewars/
│   ├── fundamentals/
│   ├── games/
│   ├── oop/
│   └── patterns/
└── test/java/io/github/matheusapolo/javafundamentals/
~~~

### Como executar

Requisitos:

- Java 17 ou superior
- Maven 3.9 ou superior

Execute os testes:

~~~bash
mvn test
~~~

Compile o projeto:

~~~bash
mvn package
~~~

Cada exemplo com método main pode ser executado pela IDE ou pelo terminal após a compilação.

### Estudos do Codewars

As soluções foram organizadas por conceito e mantêm links para os desafios originais:

| Solução | Conceito praticado | Kata |
| --- | --- | --- |
| Odd or Even | arrays e módulo | [Ver desafio](https://www.codewars.com/kata/5949481f86420f59480000e7) |
| Inclusive Sum | intervalos e repetição | [Ver desafio](https://www.codewars.com/kata/55f2b110f61eb01779000053) |
| Descending Digits | ordenação e strings | [Ver desafio](https://www.codewars.com/kata/5467e4d82edf8bbf40000155) |
| String Ending | comparação de strings | [Ver desafio](https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d) |
| Phone Number | formatação e validação | [Ver desafio](https://www.codewars.com/kata/525f50e3b73515a6db000b83) |
| Sentence Smash | varargs e junção de strings | [Ver desafio](https://www.codewars.com/kata/53dc23c68a0c93699800041d) |
| Basic Operations | switch e operadores | [Ver desafio](https://www.codewars.com/kata/57356c55867b9b7a60000bd7) |
| Needle Finder | busca em array | [Ver desafio](https://www.codewars.com/kata/56676e8fabd2d1ff3000000c) |
| Disemvowel | expressões regulares | [Ver desafio](https://www.codewars.com/kata/52fba66badcd10859f00097e) |

### Contexto

Este repositório começou como uma coleção de exercícios introdutórios. A estrutura atual preserva os conceitos praticados, ao mesmo tempo que demonstra a evolução do código por meio do histórico de commits.

## English

An organized collection of academic exercises and independent studies documenting my progress with Java. The original examples were reviewed and refactored to use descriptive names, consistent packages, separated responsibilities, and automated tests.

### Topics

- Fundamentals: user input, conditionals, methods, and mathematical operations
- Algorithms: linear search, Fibonacci, factorial, prime numbers, and matrices
- Codewars: nine refactored katas with tests and links to the original challenges
- Collections: ArrayList operations
- Object-oriented programming: encapsulation, validation, and object modeling
- Quality: Maven, JUnit 5, and continuous integration

### Running the project

Requirements:

- Java 17 or newer
- Maven 3.9 or newer

Run tests:

~~~bash
mvn test
~~~

Build the project:

~~~bash
mvn package
~~~

## Author

Matheus de Castro

- [GitHub](https://github.com/MatheusApolo)
- [LinkedIn](https://www.linkedin.com/in/matheus-de-castro-b6069440b/)
