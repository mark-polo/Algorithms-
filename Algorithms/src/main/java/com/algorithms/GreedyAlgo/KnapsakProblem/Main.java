package com.algorithms.GreedyAlgo.KnapsakProblem;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        final Item item1 = new Item(4 , 20);
        final Item item2 = new Item(3 , 18);
        final Item item3 = new Item(2 , 14);

        final Item[] arr = {item1, item2, item3};

        Arrays.sort(arr, Comparator.comparingDouble(Item::valuePerUnitOfWeight).reversed()); // від більшого до меншого

        final int W = 7;

        int weightSoFar = 0;
        double valueSoFar = 0;
        int currentItem = 0;

        while (currentItem < arr.length && weightSoFar != W) {
            if(weightSoFar + arr[currentItem].getWeight() < W) {
                // беремо цілий  предмет
                valueSoFar += arr[currentItem].getValue();
                weightSoFar += arr[currentItem].getWeight();
            } else {
                             //скільки ще потрібно  // скільки насправді важить предмет
                valueSoFar += ((W - weightSoFar) / (double) arr[currentItem].getWeight()) * arr[currentItem].getValue();

                weightSoFar = W; //рюкзак заповнений
            }

            currentItem++;
        }

        System.out.println(valueSoFar);
    }
}

class Item {
    private final int weight;
    private final int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public double valuePerUnitOfWeight() {
        return value / (double) weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{ w : " + weight + " , v: " + value + " }";
    }
}
