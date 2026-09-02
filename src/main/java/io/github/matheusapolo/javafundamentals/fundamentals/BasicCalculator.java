package io.github.matheusapolo.javafundamentals.fundamentals;

import java.util.Scanner;

public final class BasicCalculator {

    private BasicCalculator() {
    }

    public static double calculate(double firstNumber, double secondNumber, char operator) {
        return switch (operator) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            case '/' -> {
                if (secondNumber == 0) {
                    throw new IllegalArgumentException("Division by zero is not allowed.");
                }
                yield firstNumber / secondNumber;
            }
            default -> throw new IllegalArgumentException("Unsupported operator: " + operator);
        };
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            double firstNumber = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double secondNumber = scanner.nextDouble();

            System.out.print("Digite o operador (+, -, * ou /): ");
            char operator = scanner.next().charAt(0);

            System.out.printf("Resultado: %.2f%n", calculate(firstNumber, secondNumber, operator));
        } catch (IllegalArgumentException exception) {
            System.out.println("Não foi possível calcular: " + exception.getMessage());
        }
    }
}

