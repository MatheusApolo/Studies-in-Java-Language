package io.github.matheusapolo.javafundamentals;

import io.github.matheusapolo.javafundamentals.fundamentals.BasicCalculator;
import io.github.matheusapolo.javafundamentals.fundamentals.GradeAverageCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FundamentalsTest {

    @Test
    void calculatesBasicOperations() {
        assertEquals(7.0, BasicCalculator.calculate(5, 2, '+'));
        assertEquals(3.0, BasicCalculator.calculate(5, 2, '-'));
        assertEquals(10.0, BasicCalculator.calculate(5, 2, '*'));
        assertEquals(2.5, BasicCalculator.calculate(5, 2, '/'));
    }

    @Test
    void rejectsDivisionByZero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> BasicCalculator.calculate(5, 0, '/')
        );
    }

    @Test
    void calculatesAverageAndAcademicStatus() {
        double average = GradeAverageCalculator.calculateAverage(7, 8, 9);

        assertEquals(8.0, average);
        assertEquals(
                GradeAverageCalculator.AcademicStatus.APPROVED,
                GradeAverageCalculator.determineStatus(average)
        );
        assertEquals(
                GradeAverageCalculator.AcademicStatus.RECOVERY,
                GradeAverageCalculator.determineStatus(5)
        );
        assertEquals(
                GradeAverageCalculator.AcademicStatus.FAILED,
                GradeAverageCalculator.determineStatus(4.99)
        );
    }
}

