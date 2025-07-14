/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsstruktur_java;

/**
 *
 * @author Admin
 */
public class SortNames {
    public static void main(String[] args) {
        String[] names = {"Baker", "Adelia", "Sari", "Devi", "Agustin", "Rifa'i", "Caterina"};

        // Insertion Sort
        String[] insertionSortArray = names.clone();
        insertionSort(insertionSortArray);
        System.out.println("Hasil Insertion Sort:");
        printArray(insertionSortArray);

        // Selection Sort
        String[] selectionSortArray = names.clone();
        selectionSort(selectionSortArray);
        System.out.println("Hasil Selection Sort:");
        printArray(selectionSortArray);

        // Bubble Sort
        String[] bubbleSortArray = names.clone();
        bubbleSort(bubbleSortArray);
        System.out.println("Hasil Bubble Sort:");
        printArray(bubbleSortArray);
    }

    // Metode Insertion Sort untuk array String
    public static void insertionSort(String[] array) {
        for (int i = 1; i < array.length; i++) {
            String key = array[i];
            int j = i - 1;

            // Pindahkan elemen yang lebih besar dari key ke kanan
            while (j >= 0 && array[j].compareToIgnoreCase(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    // Metode Selection Sort untuk array String
    public static void selectionSort(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareToIgnoreCase(array[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            // Tukar elemen
            String temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }

    // Metode Bubble Sort untuk array String
    public static void bubbleSort(String[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j].compareToIgnoreCase(array[j + 1]) > 0) {
                    // Tukar elemen
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break; // Jika tidak ada pertukaran, array sudah terurut
            }
        }
    }

    // Metode untuk mencetak array
    public static void printArray(String[] array) {
        for (String name : array) {
            System.out.print(name + " ");
        }
        System.out.println("\n");
    }
}

   
