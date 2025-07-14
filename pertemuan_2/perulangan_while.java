/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_2;

/**
 *
 * @author Admin
 */
public class perulangan_while {
   
    public static void main(String[] args) {
        int angka = 2;

        System.out.println("Menampilkan bilangan genap dari 2 sampai 10:");

        while (angka <= 10) {
            System.out.println("Genap: " + angka);
            angka += 2; // loncatan 2 agar hanya bilangan genap
        }
    }
}


