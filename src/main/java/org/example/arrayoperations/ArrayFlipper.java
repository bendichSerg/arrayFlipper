package org.example.arrayoperations;

public class ArrayFlipper {
    public int[] flip(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }
        return recursionFlip(array, 0);
    }

    private int[] recursionFlip(int[] array, int currentIndex) {
        if (currentIndex < array.length / 2) {
            int tmpNum = array[array.length - currentIndex - 1];
            array[array.length - currentIndex - 1] = array[currentIndex];
            array[currentIndex] = tmpNum;
            return recursionFlip(array, currentIndex++);
        }
        return array;
    }

}
