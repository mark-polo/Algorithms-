package com.algorithms.GreedyAlgo.Ex3;

public class Main {
    public static void main(String[] args) {
        int [] arr =  {-1, -2, -3, -4 , 4, 3};
        int n = arr.length;

        System.out.println(max(arr, n));
    }

    private static int max(int[] arr , int n) {
        int neg_num = 0;
        int zeros = 0;
        int min_neg = Integer.MIN_VALUE;
        int result = 1;

        for (int i = 0; i < n; i++) {
            if(arr[i] < 0) {
                neg_num++;
                min_neg = Math.max(min_neg, arr[i]);
            }
            if (arr[i] == 0) {
                zeros++;
                continue;
            }

            if(zeros == n) {
                return 0;
            }

            if (neg_num % 2 == 0 && zeros == 0) {
                result = result * arr[i];
            }

            if(neg_num % 2 == 1 && zeros == 0) {
                System.out.println(arr[i]);
                result = result * arr[i];
            }

        }

        result = result / min_neg;

        System.out.println("neg num : " + neg_num);
        System.out.println("zeros : " + zeros);

        return result;
    }
}
