/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsstruktur_java;

/**
 *
 * @author Admin
 */
public class MatrixTranspose {
    public static void main(String[] args) {
        // Inisialisasi matriks 3x3 secara langsung
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriks asli:");
        printMatrix(matrix);

        int[][] transposedMatrix = transpose(matrix);

        System.out.println("Matriks transposisi:");
        printMatrix(transposedMatrix);
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] transposed = new int[3][3];
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

  
