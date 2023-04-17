package org.example;

import org.example.arrayoperations.ArrayFlipper;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayFlipper arrayFlipper = new ArrayFlipper();
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println(("Before flip array"));
        System.out.println(Arrays.toString(array));

        arrayFlipper.flip(array);
        System.out.println(("After flip array"));
        System.out.println(Arrays.toString(array));
    }
}