/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4;

/**
 *
 * @author Admin
 */
public class Method_Proseduree_Parameter {
  

    // Prosedur dengan parameter
    public static void tampilkanData(String nama, int umur, String kelas) {
        System.out.println("Nama  : " + nama);
        System.out.println("Umur  : " + umur + " tahun");
        System.out.println("Kelas : " + kelas);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        tampilkanData("Devi", 16, "XI IPA 1");
        tampilkanData("Rani", 17, "XII IPS 2");
    }
}


