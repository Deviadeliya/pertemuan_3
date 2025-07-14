/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4;

/**
 *
 * @author Admin
 */
public class Method_Fungsi_Parameter {
  
    // Method dengan parameter untuk mengecek bilangan genap atau ganjil
    public static void cekGenapGanjil(int angka) {
        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan Genap");
        } else {
            System.out.println(angka + " adalah bilangan Ganjil");
        }
    }

    public static void main(String[] args) {
        cekGenapGanjil(7);   // Panggil method dengan parameter 7
        cekGenapGanjil(10);  // Panggil method dengan parameter 10
    }
}
