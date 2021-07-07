package com.algorithms.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = new int[] {12, 445, 56, 1, 10, 345, 33, 56, 32, 67, 774};

        for (int left = 0; left < arr.length - 1; left++) {
            int minInd = left;
            for (int i = left + 1; i < arr.length; i++) {
                if(arr[i] < arr[minInd]) {
                    minInd = i;
                }
            }
            swap(arr, left, minInd);
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int minIndex, int maxIndex) {
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
}
