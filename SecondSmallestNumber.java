package com.edu;

public class SecondSmallestNumber {
    public static int findSecondSmallest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("No second smallest element found");
        }

        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] arr = { 22,67,98,90,87 };
        int secondSmallest = findSecondSmallest(arr);
        System.out.println("Second smallest number: " + secondSmallest);
    }
}
