package io.github.matheusapolo.javafundamentals;

import io.github.matheusapolo.javafundamentals.oop.inventory.Product;
import io.github.matheusapolo.javafundamentals.patterns.DiamondPrinter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InventoryAndPatternsTest {

    @Test
    void calculatesStockValueAndAvailability() {
        Product product = new Product("Caderno", 10.0, 3);

        assertEquals(30.0, product.stockValue());
        assertTrue(product.isAvailable());

        product.setStockQuantity(0);
        assertFalse(product.isAvailable());
    }

    @Test
    void createsDiamondPattern() {
        String expected = String.join(
                System.lineSeparator(),
                " *",
                "***",
                " *"
        );

        assertEquals(expected, DiamondPrinter.create(2));
    }
}
