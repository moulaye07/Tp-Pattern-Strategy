package com;

public class InsertionSort implements Strategy {
    public void sort(int[] numbers) {
        System.out.println("sorting array using insertion sort strategy");
        System.out.print(" Avant ==> ");
        for(int i=0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        int n = numbers.length;
        for (int j = 1; j < n; j++) {
            int key = numbers[j];
            int i = j-1;
            while ( (i > -1) && ( numbers[i] > key ) ) {
                numbers[i+1] = numbers[i];
                i--;
            }
            numbers[i+1] = key;

        }

        System.out.print("\n Après ==> ");
        for(int i=0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }
}
