package io.github.matheusapolo.javafundamentals.codewars;

public final class NeedleFinder {

    private NeedleFinder() {
    }

    public static String find(Object[] items) {
        for (int index = 0; index < items.length; index++) {
            if ("needle".equals(items[index])) {
                return "found the needle at position " + index;
            }
        }

        return null;
    }
}
