/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsstruktur_java;

/**
 *
 * @author Admin
 */
public class IdentityMatrixCheck {
    // Metode untuk mengecek apakah matriks 3x3 adalah matriks identitas
    public static boolean isIdentityMatrix(int[][] matrix) {
        // Memeriksa apakah ukuran matriks adalah 3x3
        if (matrix.length != 3 || matrix[0].length != 3) {
            return false;
        }

        // Memeriksa elemen matriks
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    // Elemen diagonal harus 1
                    if (matrix[i][j] != 1) {
                        return false;
                    }
                } else {
                    // Elemen non-diagonal harus 0
                    if (matrix[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true; // Matriks adalah matriks identitas
    }

    // Method utama untuk menjalankan program
    public static void main(String[] args) {
        // Contoh matriks 3x3
        int[][] matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        // Mengecek apakah matriks adalah matriks identitas
        if (isIdentityMatrix(matrix)) {
            System.out.println("Matriks adalah matriks identitas.");
        } else {
            System.out.println("Matriks bukan matriks identitas.");
        }
    }
}

