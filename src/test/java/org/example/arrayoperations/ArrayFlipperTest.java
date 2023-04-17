package org.example.arrayoperations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayFlipperTest {
    ArrayFlipper arrayFlipper = new ArrayFlipper();

    @Test
    void flipEmptyArrayTest() {
        int[] array = new int[0];
        arrayFlipper.flip(array);
        assertArrayEquals(new int[0], array);
    }

    @Test
    void flipTest() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        arrayFlipper.flip(array);
        int[] expected = new int[]{5, 4, 3, 2, 1};
        assertArrayEquals(expected, array);
    }
}