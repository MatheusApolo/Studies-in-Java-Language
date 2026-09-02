package io.github.matheusapolo.javafundamentals.codewars;

public final class PhoneNumberKata {

    private PhoneNumberKata() {
    }

    public static String format(int[] digits) {
        if (digits.length != 10) {
            throw new IllegalArgumentException("Exactly ten digits are required");
        }

        StringBuilder number = new StringBuilder(10);
        for (int digit : digits) {
            if (digit < 0 || digit > 9) {
                throw new IllegalArgumentException("Each value must be a digit from 0 to 9");
            }
            number.append(digit);
        }

        return String.format(
                "(%s) %s-%s",
                number.substring(0, 3),
                number.substring(3, 6),
                number.substring(6)
        );
    }
}
