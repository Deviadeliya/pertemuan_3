/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_3;

/**
 *
 * @author Admin
 */
public class MasterPBOPlayer {

    // Superclass
    static class Player {
        String nama;
        int level;

        Player(String nama, int level) {
            this.nama = nama;
            this.level = level;
        }

        void tampilInfo() {
            System.out.println(nama + " (Level " + level + ")");
        }

        void aksi() {
            System.out.println(nama + " sedang beraksi.");
        }
    }

    // Subclass Warrior
    static class Warrior extends Player {
        Warrior(String nama, int level) {
            super(nama, level);
        }

        @Override
        void aksi() {
            System.out.println(nama + " menyerang dengan pedang!");
        }
    }

    // Subclass Mage
    static class Mage extends Player {
        Mage(String nama, int level) {
            super(nama, level);
        }

        @Override
        void aksi() {
            System.out.println(nama + " menyerang dengan sihir!");
        }
    }

    // psvm
    public static void main(String[] args) {
        Player p1 = new Warrior("Arjuna", 10);
        Player p2 = new Mage("Sakura", 12);

        p1.tampilInfo();
        p1.aksi();

        p2.tampilInfo();
        p2.aksi();
    }
}
    

