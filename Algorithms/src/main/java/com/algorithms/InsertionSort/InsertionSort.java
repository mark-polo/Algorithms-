package com.algorithms.InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = new int[] {12, 445, 56, 1, 10, 345, 33, 66, 32, 67, 774};

        for(int left = 0; left < arr.length; left++) {
            // Вытаскиваем значение элемента
            int value = arr[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if(value < arr[i]) {
                    arr[i + 1] = arr[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            arr[i + 1] = value;
        }

        System.out.println(Arrays.toString(arr));
    }
}
