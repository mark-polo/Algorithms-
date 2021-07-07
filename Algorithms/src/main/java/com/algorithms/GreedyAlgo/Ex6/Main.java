package com.algorithms.GreedyAlgo.Ex6;

public class Main {
    public static void main(String[] args) {
        int [] arr =  {8, 4, 5, 2, 10};
        int n = arr.length;
        int k = 3;

        System.out.println(max(arr, n, k));
    }
    // f - 4,2
    // s - 5,8,10

    private static int max(int[] arr , int n, int k) {

        int result,  S = 0,  S1 = 0,  M , temp;

        for (int i = 0; i < n; i++) {
            S += arr[i];
        }

        // 10 , 8 , 5 | 4 , 2

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        M = Math.max(k, n-k);

        // sum only 10 , 8 , 5
        for (int i = 0; i < M; i++) {
            S1 += arr[i];
        }

        // 23 - 6 = 17
        result = S1 - (S - S1);

        return result;
    }
}
