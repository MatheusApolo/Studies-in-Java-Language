package io.github.matheusapolo.javafundamentals.codewars;

public final class BasicOperations {

    private BasicOperations() {
    }

    public static int calculate(String operator, int first, int second) {
        return switch (operator) {
            case "+" -> first + second;
            case "-" -> first - second;
            case "*" -> first * second;
            case "/" -> second == 0 ? 0 : first / second;
            default -> 0;
        };
    }
}
