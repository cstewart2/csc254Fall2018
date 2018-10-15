package com.noynaert.csc254;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        String[] words = {"Bob", "Ted", "Carol", "Alice", "Sam", "Abe", "Mary", "Betty"};
        selectionSort(words, 5);
        print(words, 5);

        double[] numbers = {3.14, 3.99, 88, -9.3, 0.0, -0.1, 0.1, 55};
        Arrays.sort(numbers,0, numbers.length);
        for(int i=0;i<numbers.length;i++){
            System.out.printf("[%2d] %f\n", i, numbers[i]);
        }
    }

    public static void selectionSort(String[] list, int n) {
        for (int i = 0; i < n - 1; i++) {
            String currentMin = list[i];
            int currentMinIndex = i;

            for (int j = 1 + i; j < n; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
        }
    }

    public static void print(String[] list, int n) {
        System.out.println("---------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("[%2d] %s\n", i, list[i]);
        }
    }

}
