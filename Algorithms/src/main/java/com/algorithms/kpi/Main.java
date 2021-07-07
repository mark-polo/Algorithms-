package com.algorithms.kpi;

public class Main {
    public static void main(String[] args) {
        int[]  A = {8, 20, 5, 25};
        int M = 100;

        System.out.println(p(M , A));
    }

    private static int p(int M, int[] A) {

        int count = 0;
        int h = M;
        int d;

        for(int i = 0; i < A.length; i++) {


            if(i >= 1) {
                h = M + A[i - 1];
            }

            if(A[i] > h) {
                System.out.println(i + " h : " + h);
                d = A[i] - h;
                A[i] -= d;

                System.out.println(i + " d : " + d);

                System.out.println(i + " A[i] : " + A[i]);
                count++;
            }
        }

        return count;

    }
}
