/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_3;

/**
 *
 * @author Admin
 */
public class PBOPlayer {
    static class Player {
        String nama;
        Player(String nama) { this.nama = nama; }
        void bermain() { System.out.println(nama + " sedang bermain."); }
    }

    public static void main(String[] args) {
        Player p1 = new Player("Aldi");
        Player p2 = new Player("Siska");

        p1.bermain();
        p2.bermain();
    }
}
