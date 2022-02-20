# DESAFIO DE PROGRAMAÇÃO - ACADEMIA CAPGEMINI

## Organização das pastas

Os código das questões estão disponíveis dentro de desafios/src/desafios e os testes em desafios/src/tests

## Como utilizar

Para utilizar os códigos basta ir até o arquivo Main.java e descomentar a linha com o código requerido.
as entradas são conforme indicados nos exemplos abaixo.

#### Testes unitários com Junit no Eclipse IDE:

1 - Clicar no arquivo de teste desejado

2 - Clicar com o botão direito sobre o código

3 - clicar em Run As e selecionar Junit Test

Os testes foram realizados utilizando critérios inerentes de cada questão. Considerando os requerimentos indicados no arquivo .doc onde constam os desafios propostos.

###### Testes da questão 1
- No teste da questão 1 foi verificado se o retorno é uma string quadrada, ou seja, que possui a mesma quantidade de pontos tanto verticalmente como horizontalmente.
- Foi verificado também que não há linha sendo saltada ao final dessa string

###### Testes da questão 2
- Na questão dois primeiramente foi testado um caso para uma senha válida que passa nos requisitos mínimos

- O outro teste foi feito utilizando uma senha que não possui todos os requisitos mínimos. No caso do teste faltando um caractere especial e uma quantidade mínima de 6 caracteres.

###### Testes da questão 3

- Foi testada o método permutar() ques retorna a permutação de uma palavra indicada. No teste em questão foi indicada a palavra PASTELARIA e verificado se entre as permutações havia RLATSAPEIA que é uma das permutações desta palavra.

- Por fim foi testado o médodo anagrama() que retorna quantos pares de anagramas de substrings existem em uma palavra. Foi utilizada a sequencia indicada no documento "ifailuhkqq" e esperado o retorno dos pares
[i,i],[q,q],[ifa,fai] .

## Questão 1

O código da questão 1 está presente no arquivo  **Questao1.java**. Não é necessário instalar nenhuma biblioteca externa, pois o código apenas faz uso da biblioteca ***java.util.Scanner***.

#### Demonstração de uso

entrada
```
5
```
saída
```
    *

   **

  ***

 ****

*****
```

Como solicitado no enunciado não há espaço depois da última linha



## Questão 2

O código da questão 2 está no arquivo **Questao2.java** . Assim como em na questão 1 não é necessário a instalação de nenhuma biblioteca externa, pois o código apenas faz uso da biblioteca ***java.util.Scanner***.

#### Demonstração de uso

entrada
```
yab3
```
saída
```
2
Senha fraca faltam na senha no mínimo:
- 6 caracteres
- Um caractere maiúsculo A - Z
 Um caractere especial !@#$%^&*()-+
```

A saída mostra a quantidade de caracteres necessários para atingir o mínimo de caracteres que é 6. Além disso a saída também mostra os requisitos mínimos que devem ser inseridos para que a senha seja considerada forte.

## Questão 3

O código da questão 3 se encontra no arquivo **Questao3.java**. Nessa questão foram utilizadas as seguintes bibliotecas:

java.util.HashSet

java.util.Set

java.util.Scanner

#### Demonstração de uso

entrada
```
pastelaria
```
saída
```
O número de pares de anagramas é 6
[a,a]
[a,a]
[a,a]
[ari,ria]
[astel,stela]
[astelari,stelaria]
```
O programa retorna o número de pares de anagramas para a palavra fornecida e indica também quais são estes pares



## Observações importantes

1) Os testes unitários foram feitos utilizando JUnit, caso os arquivos sejam abertos no eclipse não será necessário instalar nenhum adicional. Foram criadas classes de teste separadas para cada questão.

2) Não executar os 3 arquivos de uma só vez, pois ocorre um erro no Scanner já que cada classe fecha o Scanner quando termina de executar o código. Caso necessite basta desativar este fechamento excluindo o código entrada.close() em cada classe.

3) Não colocar uma palavra muito grande na entrada da Questão 3 (+ de 15 letras), pois o código ainda não está otimizado e vai demorar para executar.
