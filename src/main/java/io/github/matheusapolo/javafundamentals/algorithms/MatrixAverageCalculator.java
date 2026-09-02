package io.github.matheusapolo.javafundamentals.algorithms;

public final class MatrixAverageCalculator {

    private MatrixAverageCalculator() {
    }

    public static double calculateAverage(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Matrix cannot be empty.");
        }

        long sum = 0;
        int elementCount = 0;

        for (int[] row : matrix) {
            if (row == null || row.length == 0) {
                throw new IllegalArgumentException("Matrix rows cannot be empty.");
            }
            for (int value : row) {
                sum += value;
                elementCount++;
            }
        }

        return (double) sum / elementCount;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.printf("Média: %.2f%n", calculateAverage(matrix));
    }
}
