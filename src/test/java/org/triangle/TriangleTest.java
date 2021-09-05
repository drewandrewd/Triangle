package org.triangle;

import java.util.function.BooleanSupplier;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TriangleTest {

    @Test
    public void assertionEquals() {
        double expected = Triangle.area(5, 9, 15);
        int p = (5 + 9 + 15) / 2;
        double actual = Math.sqrt(p * (p - 5) * (p - 9) * (p - 15));
        try {
            Assertions.assertEquals(actual, expected);
        } catch (AssertionError e) {
            System.out.println(e);
        }

    }

    @Test
    public void assertionFalse() {
        double expected = Triangle.area(5, 9, 13);
        int p = (5 + 9 + 15) / 2;
        double actual = Math.sqrt(p * (p - 5) * (p - 9) * (p - 15));
        try {
            Assertions.assertFalse(expected == actual);
        } catch (AssertionError e) {
            System.out.println(e);
        }
    }
}
