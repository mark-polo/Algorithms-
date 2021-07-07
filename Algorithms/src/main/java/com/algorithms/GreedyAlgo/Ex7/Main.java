package com.algorithms.GreedyAlgo.Ex7;

public class Main {
    public static void main(String[] args) {
        int [] arr =  {6, 6 , 7 , 8};
        int k = 3;

        System.out.println(gcd(arr, k));
    }

    private static int gcd(int[] arr, int k) {
        int count = 0;

        for (int i : arr) {
            if (i != k || i % k == 1) {
                System.out.println(i);
                count++;
            }
        }

        return count;
    }
}