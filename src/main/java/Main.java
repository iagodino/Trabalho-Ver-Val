import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static boolean isValidSudoku(int[][] matrix) {
        // Verifica linhas e colunas
        for (int i = 0; i < 9; i++) {
            Set<Integer> row = new HashSet<>();
            Set<Integer> col = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                row.add(matrix[i][j]);
                col.add(matrix[j][i]);
            }
            if (row.size() != 9 || col.size() != 9) {
                return false;
            }
        }

        // Verifica submatrizes 3x3
        for (int blockRow = 0; blockRow < 9; blockRow += 3) {
            for (int blockCol = 0; blockCol < 9; blockCol += 3) {
                Set<Integer> block = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        block.add(matrix[blockRow + i][blockCol + j]);
                    }
                }
                if (block.size() != 9) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        run();
    }
    public static void run(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // número de instâncias

        for (int instance = 1; instance <= n; instance++) {
            int[][] matrix = new int[9][9];

            // Lê a matriz
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            // Imprime resultado
            System.out.println("Instancia " + instance);
            if (isValidSudoku(matrix)) {
                System.out.println("SIM");
            } else {
                System.out.println("NAO");
            }
            System.out.println();  // linha em branco
        }

        sc.close();
    }
}