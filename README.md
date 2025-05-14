# Trabalho-Ver-Val-Sudoku
Este repositorio foi criado para resolver o exercicio do Beecrowd de Nº 1383 Sudoku. Utilizando Maven e Junit para criar os testes unitarios

### Problema BeeCrowd
O problemas seleciodado foi o de Nº 1383 onde nele necessario criar e enviar como entrada o numero de matrizes a serem criadas e uma matriz 9x9, e como saida será respondido se o sudoku enviado é possivel fazer conforme as regras do sudoku (não pode haver numeros menores que 0 e maiores que 9 e não deve haver numeros repedidos em uma linha coluna ou quadrate(3x3)). 

## Tecnologias

- Java 22
- Maven 3.9.9
- JUnit 5.8.1

## Testes

Foram criados 9 testes unitários, cobrindo todos os aspectos possíveis do código.  
Todos apresentaram resultados esperados, e todos foram bem-sucedidos.

## Testes Incluidos

#Teste valido
```java
  @Test
	@DisplayName("Teste para Sudokus validos")
	void testIsValidSudoku() {
		int[][] matrix = {
				{1,3,2,5,7,9,4,6,8},
				{4,9,8,2,6,1,3,7,5},
				{7,5,6,3,8,4,2,1,9},
				{6,4,3,1,5,8,7,9,2},
				{5,2,1,7,9,3,8,4,6},
				{9,8,7,4,2,6,5,3,1},
				{2,1,4,9,3,5,6,8,7},
				{3,6,5,8,1,7,9,2,4},
				{8,7,9,6,4,2,1,5,3}};
		Assertions.assertTrue(Main.isValidSudoku(matrix));
	}
```

#Teste invalido pois possui posicionamento de valores não esperados
```java
  @Test
	@DisplayName("Teste para Sudokus invalidos posicões impossiveis")
	void testIsNotValidSudoku() {
		int[][] matrix = {
				{1,3,2,5,7,9,4,6,8},
				{4,9,8,2,6,1,3,7,5},
				{7,5,6,3,8,4,2,1,9},
				{6,4,3,1,5,8,7,9,2},
				{5,2,1,7,9,3,8,4,6},
				{9,8,7,4,2,6,5,3,1},
				{2,1,4,9,3,5,6,8,7},
				{3,6,5,8,1,7,9,2,4},
				{8,7,9,6,4,2,1,3,5}};
		Assertions.assertFalse(Main.isValidSudoku(matrix));
```

#Teste invalido pois tem numeros maiores que os permitidos
```java
  @Test
	@DisplayName("Teste para Sudokus invalidos posicões impossiveis")
	void testIsNotValidSudoku() {
		int[][] matrix = {
				{1,3,2,5,7,9,4,6,8},
				{4,9,8,2,6,1,3,7,5},
				{7,5,6,3,8,4,2,1,9},
				{6,4,3,1,5,8,7,9,2},
				{5,2,1,7,9,3,8,4,6},
				{9,8,7,4,2,6,5,3,1},
				{2,1,4,9,3,5,6,8,7},
				{3,6,5,8,1,7,9,2,4},
				{8,7,9,6,4,2,1,3,5}};
		Assertions.assertFalse(Main.isValidSudoku(matrix));
```
#Teste invalido por possuir numeros repitidos
```java
  @Test
	@DisplayName("Teste para Sudokus invalidos numero repitido")
	void testIsNotValidSudokuZero() {
		int[][] matrix = {
				{6,6,6,6,6,6,6,6,6},
				{6,6,6,6,6,6,6,6,6},
				{6,6,6,6,6,6,6,6,6},
				{6,6,6,6,6,6,6,6,6},
				{6,6,6,6,6,6,6,6,6},
				{6,6,6,6,6,6,6,6,6},
				{6,6,6,6,6,6,6,6,6},
				{6,6,6,6,6,6,6,6,6},
				{6,6,6,6,6,6,6,6,6}};
		Assertions.assertFalse(Main.isValidSudoku(matrix));
	}
```
