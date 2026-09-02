package io.github.matheusapolo.javafundamentals;

import io.github.matheusapolo.javafundamentals.oop.geometry.Circle;
import io.github.matheusapolo.javafundamentals.oop.geometry.Square;
import io.github.matheusapolo.javafundamentals.oop.geometry.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GeometryTest {

    @Test
    void calculatesCircleMeasurements() {
        Circle circle = new Circle(2);

        assertEquals(4 * Math.PI, circle.area(), 0.0001);
        assertEquals(4 * Math.PI, circle.perimeter(), 0.0001);
    }

    @Test
    void calculatesSquareMeasurements() {
        Square square = new Square(4);

        assertEquals(16, square.area());
        assertEquals(16, square.perimeter());
    }

    @Test
    void calculatesTriangleMeasurements() {
        Triangle triangle = new Triangle(3, 4, 5, 4);

        assertEquals(6, triangle.area());
        assertEquals(12, triangle.perimeter());
    }

    @Test
    void rejectsInvalidTriangle() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Triangle(1, 2, 10, 3)
        );
    }
}

