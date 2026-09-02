package io.github.matheusapolo.javafundamentals;

import io.github.matheusapolo.javafundamentals.algorithms.FactorialCalculator;
import io.github.matheusapolo.javafundamentals.algorithms.FibonacciCalculator;
import io.github.matheusapolo.javafundamentals.algorithms.LinearSearch;
import io.github.matheusapolo.javafundamentals.algorithms.MatrixAverageCalculator;
import io.github.matheusapolo.javafundamentals.algorithms.NumberRangeAnalyzer;
import io.github.matheusapolo.javafundamentals.algorithms.PhoneNumberFormatter;
import io.github.matheusapolo.javafundamentals.algorithms.PrimeNumberChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AlgorithmsTest {

    @Test
    void calculatesFactorial() {
        assertEquals(1, FactorialCalculator.factorial(0));
        assertEquals(720, FactorialCalculator.factorial(6));
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.factorial(-1));
    }

    @Test
    void calculatesFibonacciSequence() {
        assertEquals(0, FibonacciCalculator.fibonacci(0));
        assertEquals(1, FibonacciCalculator.fibonacci(1));
        assertEquals(55, FibonacciCalculator.fibonacci(10));
    }

    @Test
    void identifiesPrimeNumbers() {
        assertFalse(PrimeNumberChecker.isPrime(1));
        assertTrue(PrimeNumberChecker.isPrime(2));
        assertTrue(PrimeNumberChecker.isPrime(29));
        assertFalse(PrimeNumberChecker.isPrime(30));
    }

    @Test
    void performsLinearSearch() {
        int[] numbers = {10, 20, 30};

        assertEquals(1, LinearSearch.findIndex(numbers, 20));
        assertEquals(-1, LinearSearch.findIndex(numbers, 99));
    }

    @Test
    void analyzesMinimumAndMaximum() {
        NumberRangeAnalyzer.NumberRange range =
                NumberRangeAnalyzer.analyze(new int[]{-5, 8, 2, 20});

        assertEquals(-5, range.minimum());
        assertEquals(20, range.maximum());
    }

    @Test
    void formatsPhoneNumber() {
        assertEquals(
                "(123) 456-7890",
                PhoneNumberFormatter.format(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0})
        );
    }

    @Test
    void calculatesMatrixAverage() {
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        assertEquals(2.5, MatrixAverageCalculator.calculateAverage(matrix));
    }
}

