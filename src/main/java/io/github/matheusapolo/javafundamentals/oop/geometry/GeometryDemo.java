package io.github.matheusapolo.javafundamentals.oop.geometry;

import java.util.List;

public final class GeometryDemo {

    private GeometryDemo() {
    }

    public static void main(String[] args) {
        List<GeometricShape> shapes = List.of(
                new Circle(3),
                new Square(4),
                new Triangle(3, 4, 5, 4)
        );

        for (GeometricShape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName());
            System.out.printf("Área: %.2f%n", shape.area());
            System.out.printf("Perímetro: %.2f%n%n", shape.perimeter());
        }
    }
}
