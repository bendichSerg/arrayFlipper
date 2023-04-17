package org.example.arrayoperations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ArrayFlipper {
    public int[] flip(int[] array) {
        if ((array == null) || (array.length == 0)) {
            return new int[0];
        }
        int len = array.length;
        int flipLen = len / 2;
        for (int i = 0; i < flipLen; ++i) {
            array[i] = array[i] + array[len - i - 1];
            array[len - i - 1] = array[i] - array[len - i - 1];
            array[i] -= array[len - i - 1];
        }
        return array;
    }
}
