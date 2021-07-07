package com.algorithms.GreedyAlgo.Ex2;

public class Main {
    public static void main(String[] args) {
        int [] arr = {0 , 200 , 375, 550, 750, 950 , 1100 , 1500};
        System.out.println(minStation(arr, 400));
    }

    private static int minStation(int[] arr, int capacity) {
        int result = 0;
        int current_stop = 0;

        while (current_stop < arr.length - 1)  {

            int nextSt = current_stop;

            while (nextSt < arr.length - 1 && arr[nextSt + 1] - arr[current_stop] <= capacity) {
                nextSt++;
            }

            if (current_stop == nextSt) return -1; // for ex array {0, 1000, 2000 ,...} but capacity = 400

            if(nextSt < arr.length - 1) result++; // если это не конечная точка , а бензоколонка плюсуем

            current_stop = nextSt;

        }
        return result;
    }
}