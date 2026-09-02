package io.github.matheusapolo.javafundamentals.algorithms;

public final class LinearSearch {

    private LinearSearch() {
    }

    public static int findIndex(int[] numbers, int target) {
        if (numbers == null) {
            throw new IllegalArgumentException("Numbers cannot be null.");
        }

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == target) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 4, 2, 44, 3, 23, 12, 3, 8};
        System.out.println("Índice: " + findIndex(numbers, 4));
    }
}

