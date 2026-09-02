package io.github.matheusapolo.javafundamentals;

import io.github.matheusapolo.javafundamentals.codewars.BasicOperations;
import io.github.matheusapolo.javafundamentals.codewars.DescendingDigits;
import io.github.matheusapolo.javafundamentals.codewars.Disemvowel;
import io.github.matheusapolo.javafundamentals.codewars.InclusiveSum;
import io.github.matheusapolo.javafundamentals.codewars.NeedleFinder;
import io.github.matheusapolo.javafundamentals.codewars.OddOrEven;
import io.github.matheusapolo.javafundamentals.codewars.PhoneNumberKata;
import io.github.matheusapolo.javafundamentals.codewars.SentenceSmash;
import io.github.matheusapolo.javafundamentals.codewars.StringEnding;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CodewarsTest {

    @Test
    void classifiesArraySumAsOddOrEven() {
        assertEquals("even", OddOrEven.classify(new int[]{}));
        assertEquals("odd", OddOrEven.classify(new int[]{1, 2, 4}));
    }

    @Test
    void sumsAnInclusiveRangeInEitherDirection() {
        assertEquals(6, InclusiveSum.between(1, 3));
        assertEquals(-1, InclusiveSum.between(0, -1));
        assertEquals(5, InclusiveSum.between(5, 5));
    }

    @Test
    void sortsDigitsInDescendingOrder() {
        assertEquals(54421, DescendingDigits.sort(42145));
        assertEquals(0, DescendingDigits.sort(0));
    }

    @Test
    void checksWhetherTextEndsWithSuffix() {
        assertTrue(StringEnding.matches("abc", "bc"));
        assertFalse(StringEnding.matches("abc", "d"));
    }

    @Test
    void formatsAUsPhoneNumber() {
        assertEquals(
                "(123) 456-7890",
                PhoneNumberKata.format(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0})
        );
    }

    @Test
    void joinsWordsWithSingleSpaces() {
        assertEquals("hello world", SentenceSmash.join("hello", "world"));
        assertEquals("", SentenceSmash.join());
    }

    @Test
    void performsBasicIntegerOperations() {
        assertEquals(7, BasicOperations.calculate("+", 3, 4));
        assertEquals(3, BasicOperations.calculate("/", 7, 2));
        assertEquals(0, BasicOperations.calculate("/", 7, 0));
    }

    @Test
    void findsNeedlePosition() {
        assertEquals(
                "found the needle at position 2",
                NeedleFinder.find(new Object[]{"hay", 42, "needle"})
        );
        assertNull(NeedleFinder.find(new Object[]{"hay", 42}));
    }

    @Test
    void removesVowelsFromText() {
        assertEquals("Ths wbst s fr lsrs LL!", Disemvowel.removeVowels("This website is for losers LOL!"));
    }
}
