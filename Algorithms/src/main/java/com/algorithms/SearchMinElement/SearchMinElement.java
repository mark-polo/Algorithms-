package com.algorithms.SearchMinElement;

public class SearchMinElement {
    public static void main(String[] args) {
        int [] arr = new int[] {12, 445, 56, 1, 10, 345, 33, 56, 32, 67, 774};

        int minValue = arr[0];
        int minPosition = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < minValue) {
                minValue = arr[i];
                minPosition = i;
            }
        }
        System.out.println(minValue + " " + minPosition);
    }
}