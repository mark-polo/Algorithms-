package com.algorithms.GreedyAlgo.Ex4;

public class Main {
    public static void main(String[] args) {

        int [] arr = {0, -1 , 0};
        int n = arr.length;

        System.out.println(max(arr, n, 4));
    }

    private static int max(int[] arr , int n , int k) {
        int result = 0;

        for(int i = 1; i < k; i++) {

            int min = 2147483647;
            int index = -1;

            for (int j = 0; j < n; j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }

            if(min == 0) break;

            arr[index] = - arr[index];

        }

        for (int i = 0; i < n; i++) {
            result += arr[i];
        }

        return result;
    }
}
