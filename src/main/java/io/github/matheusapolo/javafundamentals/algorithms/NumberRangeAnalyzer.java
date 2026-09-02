package io.github.matheusapolo.javafundamentals.algorithms;

public final class NumberRangeAnalyzer {

    public record NumberRange(int minimum, int maximum) {
    }

    private NumberRangeAnalyzer() {
    }

    public static NumberRange analyze(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required.");
        }

        int minimum = numbers[0];
        int maximum = numbers[0];

        for (int number : numbers) {
            minimum = Math.min(minimum, number);
            maximum = Math.max(maximum, number);
        }

        return new NumberRange(minimum, maximum);
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 67, 4, 3, 1, 2, 45, 8, 6};
        NumberRange range = analyze(numbers);
        System.out.printf("Maior: %d%nMenor: %d%n", range.maximum(), range.minimum());
    }
}

