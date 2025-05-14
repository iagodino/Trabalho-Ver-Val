import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

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
	}
	
	@Test
	@DisplayName("Teste para Sudokus invalidos linhas e colunas com numeros repitidos")
	void testIsNotValidSudokuRepitidos() {
		int[][] matrix = {
				{1,3,2,5,7,9,4,6,8},
				{4,9,8,2,6,1,3,7,5},
				{7,5,6,3,8,4,2,1,9},
				{6,4,3,1,5,8,7,9,2},
				{5,2,1,7,9,3,8,4,6},
				{9,8,7,7,2,6,5,3,1},
				{2,1,4,9,3,5,6,8,7},
				{3,6,5,8,1,7,9,2,4},
				{8,7,9,6,4,2,1,3,5}};
		Assertions.assertFalse(Main.isValidSudoku(matrix));
	}
	
	@Test
	@DisplayName("Teste para Sudokus invalidos com valores maiores que 9")
	void testIsNotValidSudokuMaioresQue9() {
		int[][] matrix = {
				{1,3,2,5,7,9,4,6,8},
				{4,9,8,2,6,1,3,7,5},
				{7,5,6,3,8,4,2,1,9},
				{6,4,3,1,5,83,7,9,2},
				{5,2,1,7,9,3,8,4,6},
				{9,8,7,7,2,6,5,3,1},
				{2,12,4,9,3,5,6,8,7},
				{3,6,5,8,1,7,9,2,4},
				{8,7,9,6,4,2,1,3,5}};
		Assertions.assertFalse(Main.isValidSudoku(matrix));
	}
	
	@Test
	@DisplayName("Teste para Sudokus invalidos linha impossiveis")
	void testIsNotValidSudokuLinha() {
		int[][] matrix = {
				{1,3,2,5,7,9,4,6,8},
				{4,9,8,2,6,1,3,7,5},
				{7,5,6,3,8,4,2,1,9},
				{6,4,3,1,5,8,7,9,2},
				{5,2,1,7,9,3,8,4,6},
				{9,8,7,4,2,6,5,3,1},
				{2,1,4,9,3,5,6,8,7},
				{3,6,5,8,1,7,9,2,4},
				{8,7,9,6,4,1,1,3,5}};
		Assertions.assertFalse(Main.isValidSudoku(matrix));
	}
	
	@Test
	@DisplayName("Teste para Sudokus invalidos impossivel ter 0")
	void testIsNotValidSudoku1Numero() {
		int[][] matrix = {
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0}};
		Assertions.assertFalse(Main.isValidSudoku(matrix));
	}
	
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
	
	@Test
	@DisplayName("Teste para Sudokus invalidos Caixa por linha errada")
	void testIsValidSudokuBoxLinha() {
		int[][] matrix = {
				{1,3,2,5,7,9,4,6,8},
				{4,9,8,2,6,1,3,7,5},
				{6,4,3,1,5,8,7,9,2},
				{7,5,6,3,8,4,2,1,9},
				{5,2,1,7,9,3,8,4,6},
				{9,8,7,4,2,6,5,3,1},
				{2,1,4,9,3,5,6,8,7},
				{3,6,5,8,1,7,9,2,4},
				{8,7,9,6,4,2,1,5,3}};
		Assertions.assertFalse(Main.isValidSudoku(matrix));
	}
	@Test
	@DisplayName("Teste para Sudokus invalidos Caixa por coluna errada")
	void testIsValidSudokuBoxColuna() {
		int[][] matrix = {
				{1,3,2,5,7,9,6,8,4},
				{4,9,8,2,6,1,7,5,3},
				{6,4,3,1,5,8,9,2,7},
				{7,5,6,3,8,4,1,9,2},
				{5,2,1,7,9,3,4,6,8},
				{9,8,7,4,2,6,3,1,5},
				{2,1,4,9,3,5,8,7,6},
				{3,6,5,8,1,7,2,4,9},
				{8,7,9,6,4,2,5,3,1}};
		Assertions.assertFalse(Main.isValidSudoku(matrix));
	}

}
