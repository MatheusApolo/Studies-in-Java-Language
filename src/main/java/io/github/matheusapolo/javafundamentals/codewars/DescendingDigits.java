package io.github.matheusapolo.javafundamentals.codewars;

import java.util.Arrays;

public final class DescendingDigits {

    private DescendingDigits() {
    }

    public static int sort(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        char[] digits = Integer.toString(number).toCharArray();
        Arrays.sort(digits);

        return Integer.parseInt(new StringBuilder(new String(digits)).reverse().toString());
    }
}
