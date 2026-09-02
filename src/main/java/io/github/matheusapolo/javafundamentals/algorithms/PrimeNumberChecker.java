package io.github.matheusapolo.javafundamentals.algorithms;

public final class PrimeNumberChecker {

    private PrimeNumberChecker() {
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        for (int divisor = 3; divisor <= Math.sqrt(number); divisor += 2) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 29;
        System.out.printf("%d %s primo.%n", number, isPrime(number) ? "é" : "não é");
    }
}

