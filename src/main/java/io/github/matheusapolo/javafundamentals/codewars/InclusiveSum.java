package io.github.matheusapolo.javafundamentals.codewars;

public final class InclusiveSum {

    private InclusiveSum() {
    }

    public static int between(int first, int second) {
        int start = Math.min(first, second);
        int end = Math.max(first, second);
        int sum = 0;

        for (int number = start; number <= end; number++) {
            sum += number;
        }

        return sum;
    }
}
