package io.github.matheusapolo.javafundamentals.fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public final class GradeAverageCalculator {

    public enum AcademicStatus {
        APPROVED("Aprovado"),
        RECOVERY("Recuperação"),
        FAILED("Reprovado");

        private final String label;

        AcademicStatus(String label) {
            this.label = label;
        }

        public String label() {
            return label;
        }
    }

    private GradeAverageCalculator() {
    }

    public static double calculateAverage(double... grades) {
        if (grades == null || grades.length == 0) {
            throw new IllegalArgumentException("At least one grade is required.");
        }

        boolean hasInvalidGrade = Arrays.stream(grades)
                .anyMatch(grade -> grade < 0 || grade > 10);

        if (hasInvalidGrade) {
            throw new IllegalArgumentException("Grades must be between 0 and 10.");
        }

        return Arrays.stream(grades).average().orElseThrow();
    }

    public static AcademicStatus determineStatus(double average) {
        if (average < 0 || average > 10) {
            throw new IllegalArgumentException("Average must be between 0 and 10.");
        }
        if (average >= 7) {
            return AcademicStatus.APPROVED;
        }
        if (average >= 5) {
            return AcademicStatus.RECOVERY;
        }
        return AcademicStatus.FAILED;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o nome do aluno: ");
            String studentName = scanner.nextLine();

            double[] grades = new double[3];
            for (int index = 0; index < grades.length; index++) {
                System.out.printf("Digite a nota %d: ", index + 1);
                grades[index] = scanner.nextDouble();
            }

            double average = calculateAverage(grades);
            AcademicStatus status = determineStatus(average);

            System.out.printf("%nAluno: %s%n", studentName);
            System.out.printf("Média: %.2f%n", average);
            System.out.println("Situação: " + status.label());
        } catch (IllegalArgumentException exception) {
            System.out.println("Dados inválidos: " + exception.getMessage());
        }
    }
}

