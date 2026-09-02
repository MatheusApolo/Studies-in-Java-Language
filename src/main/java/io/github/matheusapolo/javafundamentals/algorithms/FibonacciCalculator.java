package io.github.matheusapolo.javafundamentals.algorithms;

public final class FibonacciCalculator {

    private FibonacciCalculator() {
    }

    public static long fibonacci(int position) {
        if (position < 0 || position > 92) {
            throw new IllegalArgumentException("Position must be between 0 and 92.");
        }
        if (position < 2) {
            return position;
        }

        long previous = 0;
        long current = 1;

        for (int index = 2; index <= position; index++) {
            long next = previous + current;
            previous = current;
            current = next;
        }

        return current;
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci na posição 10: " + fibonacci(10));
    }
}

