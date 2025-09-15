import java.util.Random;

public class Matrix2 {
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10);
        return matrix;
    }
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length, cols = matrix.length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < cols; i++)
            for (int j = 0; j < rows; j++)
                transposed[i][j] = matrix[j][i];
        return transposed;
    }
    public static int determinant2x2(int[][] m) {
        return m * m[1][1] - m[1] * m[1];
    }
    public static int determinant3x3(int[][] m) {
        return m * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[1] * (m[1] * m[2][2] - m[1][2] * m[2])
             + m[2] * (m[1] * m[2][1] - m[1][1] * m[2]);
    }
    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) throw new ArithmeticException("Matrix not invertible");
        double[][] inv = {
            { m[1][1], -m[1] },
            { -m[1], m }
        };
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                inv[i][j] = inv[i][j] / det;
        return inv;
    }
    public static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) throw new ArithmeticException("Matrix not invertible");
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inv[j][i] = cofactor(m, i, j) / (double)det; 
        return inv;
    }
    private static int cofactor(int[][] m, int row, int col) {
        int[][] minor = new int[2][2];
        int mr = 0, mc;
        for (int i = 0; i < 3; i++) {
            if (i == row) continue;
            mc = 0;
            for (int j = 0; j < 3; j++) {
                if (j == col) continue;
                minor[mr][mc++] = m[i][j];
            }
            mr++;
        }
        int sign = ((row + col) % 2 == 0) ? 1 : -1;
        return sign * determinant2x2(minor);
    }
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row)
                System.out.printf("%.2f ", val);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat = createRandomMatrix(3, 3);
        System.out.println("Matrix:");
        displayMatrix(mat);

        System.out.println("Transpose:");
        displayMatrix(transpose(mat));

        System.out.println("Determinant (3x3): " + determinant3x3(mat));
        
        try {
            System.out.println("Inverse (3x3):");
            displayMatrix(inverse3x3(mat));
        } catch (ArithmeticException e) {
            System.out.println("Matrix not invertible.");
        }
    }
}