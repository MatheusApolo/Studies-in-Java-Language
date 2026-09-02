package io.github.matheusapolo.javafundamentals.algorithms;

public final class FactorialCalculator {

    private FactorialCalculator() {
    }

    public static long factorial(int number) {
        if (number < 0 || number > 20) {
            throw new IllegalArgumentException("Number must be between 0 and 20.");
        }

        long result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Fatorial de 6: " + factorial(6));
    }
}

