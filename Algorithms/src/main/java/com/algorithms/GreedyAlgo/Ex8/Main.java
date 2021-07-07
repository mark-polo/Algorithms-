package com.algorithms.GreedyAlgo.Ex8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] a =  {3, 2, 1};
        int [] b = {2, 1, 3};
        int n = a.length;

        System.out.println(max(a , b, n));
    }

    private static int max(int[] a, int[] b, int n) {

        int sum = 0;

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0; i < n; i++) {
            sum = sum + Math.abs(a[i] - b[i]);
        }

        return sum;
    }
}
