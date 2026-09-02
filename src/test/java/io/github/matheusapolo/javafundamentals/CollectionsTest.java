package io.github.matheusapolo.javafundamentals;

import io.github.matheusapolo.javafundamentals.collections.NameListManager;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CollectionsTest {

    @Test
    void addsListsAndRemovesNames() {
        NameListManager manager = new NameListManager();

        manager.add("Ana");
        manager.add("Bruno");

        assertEquals(List.of("Ana", "Bruno"), manager.list());
        assertTrue(manager.remove("Ana"));
        assertFalse(manager.remove("Carlos"));
        assertEquals(List.of("Bruno"), manager.list());
    }

    @Test
    void rejectsBlankNames() {
        NameListManager manager = new NameListManager();

        assertThrows(IllegalArgumentException.class, () -> manager.add(" "));
    }
}

