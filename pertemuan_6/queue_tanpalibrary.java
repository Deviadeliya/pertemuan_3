/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_6;

/**
 *
 * @author Admin
 */
 import java.util.Scanner;
public class queue_tanpalibrary {
   
    private static int maxSize;        // Ukuran maksimum queue
    private static int[] queue;        // Array untuk menyimpan data
    private static int front;          // Pointer depan
    private static int rear;           // Pointer belakang

    // Konstruktor statis
    static {
        front = -1;
        rear = -1;
    }

    // Inisialisasi queue
    public static void initQueue(int size) {
        maxSize = size;
        queue = new int[maxSize];
    }

    // Mengecek apakah queue kosong
    public static boolean isEmpty() {
        return front == -1 || front > rear;
    }

    // Mengecek apakah queue penuh
    public static boolean isFull() {
        return rear == maxSize - 1;
    }

    // Enqueue (menambahkan elemen)
    public static void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue penuh. Tidak bisa menambahkan " + data);
        } else {
            if (isEmpty()) {
                front = 0;
            }
            rear++;
            queue[rear] = data;
            System.out.println("Berhasil menambahkan: " + data);
        }
    }

    // Dequeue (menghapus elemen)
    public static void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong. Tidak bisa menghapus data.");
        } else {
            System.out.println("Menghapus: " + queue[front]);
            front++;
        }
    }

    // Menampilkan isi queue
    public static void display() {
        if (isEmpty()) {
            System.out.println("Queue kosong.");
        } else {
            System.out.print("Isi Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    // Main program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ukuran maksimum Queue: ");
        int size = scanner.nextInt();
        initQueue(size);

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Enqueue (Tambah)");
            System.out.println("2. Dequeue (Hapus)");
            System.out.println("3. Tampilkan Queue");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan data: ");
                    int data = scanner.nextInt();
                    enqueue(data);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 4);

        scanner.close();
    }
}


