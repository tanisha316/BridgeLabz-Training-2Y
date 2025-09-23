import java.util.Random;
import java.util.Scanner;
public class Matrix {
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); 
            }
        }
        
        return matrix;
    }
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        
        return result;
    }
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        
        return result;
    }
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        
        int[][] result = new int[rowsA][colsB];
        
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows for matrices: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns for matrices: ");
        int cols = sc.nextInt();
        

        int[][] matrix1 = createRandomMatrix(rows, cols);
        int[][] matrix2 = createRandomMatrix(rows, cols);
        
        System.out.println("\nMatrix A:");
        displayMatrix(matrix1);
        System.out.println("\nMatrix B:");
        displayMatrix(matrix2);
        
        System.out.println("\nAddition of Matrices:");
        displayMatrix(addMatrices(matrix1, matrix2));
   
        System.out.println("\nSubtraction of Matrices:");
        displayMatrix(subtractMatrices(matrix1, matrix2));
        
        
        System.out.println("\nMatrix Multiplication:");
        if (cols == rows) {
            displayMatrix(multiplyMatrices(matrix1, matrix2));
        } else {
            System.out.println("Matrix multiplication not possible (columns of A != rows of B)");
        }
    }
}
