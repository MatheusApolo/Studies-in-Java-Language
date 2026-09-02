package io.github.matheusapolo.javafundamentals.codewars;

public final class Disemvowel {

    private Disemvowel() {
    }

    public static String removeVowels(String text) {
        return text.replaceAll("[aeiouAEIOU]", "");
    }
}
