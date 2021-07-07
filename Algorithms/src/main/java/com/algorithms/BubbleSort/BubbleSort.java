package com.algorithms.BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = new int[] {12, 445, 56, 1, 10, 345, 33, 66, 32, 67, 774};

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    isSorted = false;
                }
            }
            printArray(arr);
        }



    }

    private static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if(i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print(" ]");
    }
}
