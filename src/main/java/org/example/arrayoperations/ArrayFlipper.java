package org.example.arrayoperations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ArrayFlipper {
    public void flip(int[] array) {
        int len = array.length;
        if (len != 0) {
            int flipLen = len / 2;
            for (int i = 0; i < flipLen; ++i) {
                array[i] = array[i] + array[len - i - 1];
                array[len - i - 1] = array[i] - array[len - i - 1];
                array[i] -= array[len - i - 1];
            }
        }
    }
}
