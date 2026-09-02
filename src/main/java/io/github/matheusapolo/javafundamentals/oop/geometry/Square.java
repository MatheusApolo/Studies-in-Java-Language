package io.github.matheusapolo.javafundamentals.oop.geometry;

public class Square implements GeometricShape {

    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be greater than zero.");
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}

