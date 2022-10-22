package com;

public class BubbleSort implements Strategy {
    public void sort (int[] numbers) {
        System.out.println("sorting array using bubble sort strategy");
        System.out.print(" Avant ==> ");
        for(int i=0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        int n = numbers.length;
        int temp = 0;
        for(int i=0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    // echange
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.print("\n Après ==> ");
        for(int i=0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }
}
