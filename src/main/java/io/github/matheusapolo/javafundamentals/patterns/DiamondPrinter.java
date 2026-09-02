package io.github.matheusapolo.javafundamentals.patterns;

public final class DiamondPrinter {

    private DiamondPrinter() {
    }

    public static String create(int halfHeight) {
        if (halfHeight < 1) {
            throw new IllegalArgumentException("Half height must be at least 1.");
        }

        StringBuilder diamond = new StringBuilder();
        for (int row = 1; row <= halfHeight; row++) {
            appendRow(diamond, halfHeight - row, 2 * row - 1);
        }
        for (int row = halfHeight - 1; row >= 1; row--) {
            appendRow(diamond, halfHeight - row, 2 * row - 1);
        }
        return diamond.toString().stripTrailing();
    }

    private static void appendRow(StringBuilder output, int spaces, int stars) {
        output.append(" ".repeat(spaces));
        output.append("*".repeat(stars));
        output.append(System.lineSeparator());
    }

    public static void main(String[] args) {
        System.out.println(create(5));
    }
}

