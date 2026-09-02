package io.github.matheusapolo.javafundamentals.codewars;

public final class OddOrEven {

    private OddOrEven() {
    }

    public static String classify(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum % 2 == 0 ? "even" : "odd";
    }
}
