package com.algorithms.GreedyAlgo.Ex5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr =  {3, 5, 6, 1};
        int n = arr.length;

        System.out.println(max(arr, n));
    }
    private static int max(int[] arr , int n) {
        Arrays.sort(arr);

        int res = 0;
        int zeros = 0;

        for (int i = 0; i < n; i++) {

            if(arr[i] == 0) {
                zeros++;
                continue;
            }

            if(zeros == n) {
                return 0;
            }

            res += arr[i] * i;
        }

        return res;
    }
}
