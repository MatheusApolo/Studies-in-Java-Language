package io.github.matheusapolo.javafundamentals.oop.geometry;

public class Triangle implements GeometricShape {

    private final double sideA;
    private final double sideB;
    private final double sideC;
    private final double heightRelativeToSideA;

    public Triangle(double sideA, double sideB, double sideC, double heightRelativeToSideA) {
        validatePositive(sideA, sideB, sideC, heightRelativeToSideA);
        validateTriangleInequality(sideA, sideB, sideC);

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.heightRelativeToSideA = heightRelativeToSideA;
    }

    private static void validatePositive(double... measurements) {
        for (double measurement : measurements) {
            if (measurement <= 0) {
                throw new IllegalArgumentException("Measurements must be greater than zero.");
            }
        }
    }

    private static void validateTriangleInequality(double sideA, double sideB, double sideC) {
        if (sideA + sideB <= sideC
                || sideA + sideC <= sideB
                || sideB + sideC <= sideA) {
            throw new IllegalArgumentException("The sides do not form a valid triangle.");
        }
    }

    @Override
    public double area() {
        return sideA * heightRelativeToSideA / 2;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}

