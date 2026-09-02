package io.github.matheusapolo.javafundamentals.algorithms;

import java.util.Arrays;
import java.util.stream.Collectors;

public final class PhoneNumberFormatter {

    private PhoneNumberFormatter() {
    }

    public static String format(int[] digits) {
        if (digits == null || digits.length != 10) {
            throw new IllegalArgumentException("Exactly 10 digits are required.");
        }
        if (Arrays.stream(digits).anyMatch(digit -> digit < 0 || digit > 9)) {
            throw new IllegalArgumentException("Every value must be a digit between 0 and 9.");
        }

        String value = Arrays.stream(digits)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());

        return "(%s) %s-%s".formatted(
                value.substring(0, 3),
                value.substring(3, 6),
                value.substring(6)
        );
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(format(digits));
    }
}

