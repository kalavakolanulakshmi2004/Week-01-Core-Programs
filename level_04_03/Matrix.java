package level3;
import java.util.*;
public class Matrix {
    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10);
        return matrix;
    }
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length, sum;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                sum = 0;
                for (int k = 0; k < A[0].length; k++)
                    sum += A[i][k] * B[k][j];
                result[i][j] = sum;
            }
        return result;
    }
    public static int[][] transposeMatrix(int[][] A) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[j][i] = A[i][j];
        return result;
    }
    public static int determinant2x2(int[][] A) {
        return A[0][0] * A[1][1] - A[0][1] * A[1][0];
    }
    public static int determinant3x3(int[][] A) {
        return A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1]) -
                A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0]) +
                A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);
    }
    public static double[][] inverse2x2(int[][] A) {
        int det = determinant2x2(A);
        if (det == 0) return null;
        double[][] inverse = new double[2][2];
        inverse[0][0] = A[1][1] / (double) det;
        inverse[0][1] = -A[0][1] / (double) det;
        inverse[1][0] = -A[1][0] / (double) det;
        inverse[1][1] = A[0][0] / (double) det;
        return inverse;
    }
    public static double[][] inverse3x3(int[][] A) {
        int det = determinant3x3(A);
        if (det == 0) return null;
        double[][] adj = new double[3][3];
        adj[0][0] = A[1][1] * A[2][2] - A[1][2] * A[2][1];
        adj[0][1] = A[0][2] * A[2][1] - A[0][1] * A[2][2];
        adj[0][2] = A[0][1] * A[1][2] - A[0][2] * A[1][1];
        adj[1][0] = A[1][2] * A[2][0] - A[1][0] * A[2][2];
        adj[1][1] = A[0][0] * A[2][2] - A[0][2] * A[2][0];
        adj[1][2] = A[0][2] * A[1][0] - A[0][0] * A[1][2];
        adj[2][0] = A[1][0] * A[2][1] - A[1][1] * A[2][0];
        adj[2][1] = A[0][1] * A[2][0] - A[0][0] * A[2][1];
        adj[2][2] = A[0][0] * A[1][1] - A[0][1] * A[1][0];
        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inverse[i][j] = Math.round((adj[i][j] / (double) det));
        return inverse;
    }
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }
    public static void displayMatrix(double[][] matrix) {
        if (matrix == null) {
            System.out.println("Matrix has no inverse.");
            return;
        }
        for (double[] row : matrix) {
            for (double val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] A = generateMatrix(3, 3);
        int[][] B = generateMatrix(3, 3);
        System.out.println("Matrix A:");
        displayMatrix(A);
        System.out.println("\nMatrix B:");
        displayMatrix(B);
        System.out.println("\nAddition:");
        displayMatrix(addMatrices(A, B));
        System.out.println("\nSubtraction:");
        displayMatrix(subtractMatrices(A, B));
        System.out.println("\nMultiplication:");
        displayMatrix(multiplyMatrices(A, B));
        System.out.println("\nTranspose of A:");
        displayMatrix(transposeMatrix(A));
        System.out.println("\nDeterminant of A: " + determinant3x3(A));
        System.out.println("\nInverse of A:");
        displayMatrix(inverse3x3(A));
    }
}
