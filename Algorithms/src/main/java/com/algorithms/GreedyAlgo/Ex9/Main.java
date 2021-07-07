package com.algorithms.GreedyAlgo.Ex9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr =  {3, 1, 2};
        int n = arr.length;
        int k = 2;

        System.out.println(win(arr, n, k));
    }

    private static int win(int[] arr , int n, int k) {

        int max = Arrays.stream(arr).max().getAsInt();

        System.out.println(max);

        if(k >= n - 1) {
            return n;
        }

        int best = 0 , times = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > best) {
                best = arr[i];

                if(i == 1) {
                    times = 1;
                }
            } else {
                times++;
            }

            if (times >= k) {
                return best;
            }
        }

        return best;
    }
}
