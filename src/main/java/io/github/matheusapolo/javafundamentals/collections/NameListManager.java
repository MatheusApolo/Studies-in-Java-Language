package io.github.matheusapolo.javafundamentals.collections;

import java.util.ArrayList;
import java.util.List;

public class NameListManager {

    private final List<String> names = new ArrayList<>();

    public void add(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank.");
        }
        names.add(name.trim());
    }

    public boolean remove(String name) {
        return names.remove(name);
    }

    public List<String> list() {
        return List.copyOf(names);
    }

    public boolean isEmpty() {
        return names.isEmpty();
    }
}

