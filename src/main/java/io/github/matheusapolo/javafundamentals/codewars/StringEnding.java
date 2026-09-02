package io.github.matheusapolo.javafundamentals.codewars;

public final class StringEnding {

    private StringEnding() {
    }

    public static boolean matches(String text, String ending) {
        return text.endsWith(ending);
    }
}
