/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_7;

/**
 *
 * @author Admin
 */import java.util.Scanner;
public class ascending {
    
    static int max = 100;
    static int[] queue = new int[max];
    static int front = -1, rear = -1;

    // Menambahkan elemen ke dalam queue
    public static void enqueue(int data) {
        if (rear == max - 1) {
            System.out.println("Queue penuh!");
        } else {
            if (front == -1) front = 0;
            rear++;
            queue[rear] = data;
        }
    }

    // Menghapus elemen dari queue
    public static void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue kosong!");
        } else {
            System.out.println("Data " + queue[front] + " dihapus");
            front++;
        }
    }

    // Menampilkan elemen queue dalam urutan ascending
    public static void tampilAscending() {
        if (front == -1 || front > rear) {
            System.out.println("Queue kosong!");
            return;
        }

        // Salin data queue ke array sementara
        int[] temp = new int[rear - front + 1];
        int j = 0;
        for (int i = front; i <= rear; i++) {
            temp[j++] = queue[i];
        }

        // Sorting ascending (Bubble Sort)
        for (int i = 0; i < temp.length - 1; i++) {
            for (int k = 0; k < temp.length - i - 1; k++) {
                if (temp[k] > temp[k + 1]) {
                    int swap = temp[k];
                    temp[k] = temp[k + 1];
                    temp[k + 1] = swap;
                }
            }
        }

        System.out.print("Data Queue (Ascending): ");
        for (int val : temp) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int pilihan, data;
            do {
                System.out.println("\n===== MENU QUEUE =====");
                System.out.println("1. Enqueue (Tambah)");
                System.out.println("2. Dequeue (Hapus)");
                System.out.println("3. Tampilkan Ascending");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = sc.nextInt();
                
                switch (pilihan) {
                    case 1 -> {
                        System.out.print("Masukkan data: ");
                        data = sc.nextInt();
                        enqueue(data);
                    }
                    case 2 -> dequeue();
                    case 3 -> tampilAscending();
                    case 4 -> System.out.println("Program selesai.");
                    default -> System.out.println("Pilihan tidak tersedia!");
                }
            } while (pilihan != 4);
        }
    }
}


