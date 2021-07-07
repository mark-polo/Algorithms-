package com.algorithms.ChooseSort;

public class ChooseSort {
    public static void main(String[] args) {
        int [] arr = new int[] {12, 445, 56, 1, 10, 345, 33, 56, 32, 67, 774};

        for (int step = 0; step < arr.length; step++) {
            printArray(arr);
            int index = minValue(arr, step);

            int temp = arr[step];
            arr[step] = arr[index];
            arr[index] = temp;
        }

    }

    private static int minValue(int[] arr, int start) {
        int minValue = arr[start];
        int minIndex = start;

        for (int i = start + 1; i < arr.length; i++) {
            if(arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if(i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println(" ]");
    }
}