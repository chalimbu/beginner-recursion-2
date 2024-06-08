package org.sumrecursive;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SourceTest {

    @Test
    void test00() {
        assertEquals(26, Source.sumNumbersRecursive(List.of(5, 2, 9, 10)));
    }

    @Test
    void test01() {
        assertEquals(1, Source.sumNumbersRecursive(List.of(1, -1, 1, -1, 1, -1, 1))); // -> 1
    }

    @Test
    void test02() {
        assertEquals(0, Source.sumNumbersRecursive(List.of()));// -> 0
    }

    @Test
    void test03() {
        assertEquals(1001, Source.sumNumbersRecursive(List.of(1000, 0, 0, 0, 0, 0, 1)));// -> 1001
    }

    @Test
    void test04() {
        assertEquals(777, Source.sumNumbersRecursive(List.of(700, 70, 7))); // -> 777
    }

    @Test
    void test05() {
        assertEquals(-55, Source.sumNumbersRecursive(List.of(-10, -9, -8, -7, -6, -5, -4, -3, -2, -1))); // -> -55
    }

    @Test
    void test06() {
        assertEquals(0, Source.sumNumbersRecursive(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))); // -> 0
    }

    @Test
    void test07() {
        assertEquals(137174205, Source.sumNumbersRecursive(List.of(123456789, 12345678, 1234567, 123456, 12345, 1234, 123, 12, 1, 0))); // -> 1836311903
    }

}
