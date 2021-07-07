package com.algorithms.GreedyAlgo.Ex1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = {3, 1, 7, 9, 9, 5, 10};

        Arrays.sort(arr);

        for(int i = 0; i < arr.length/ 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = t;
        }

       // System.out.println(num(arr));

        System.out.println(greedyEx1(arr));
    }

    private static String greedyEx1(int[] arr) {
        Arrays.sort(arr);
        String result = "";
        for(int i = arr.length - 1; i >= 0; i--)
            result += arr[i];

        return result;
    }

    private static int num(int[] arr) {
        int result = 0;

        for (int i = arr.length - 1 , n = 0; i >= 0; --i, n++) {
            int pos = (int)Math.pow(10, i);
            result += arr[n] * pos;
        }
        return result;
    }
}
