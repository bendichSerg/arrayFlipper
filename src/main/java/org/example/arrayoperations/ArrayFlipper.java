package org.example.arrayoperations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ArrayFlipper {
    public int[] flip(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }
        return recursionFlip(array, 0);
    }

    private int[] recursionFlip(int[] array, int changeNum) {
        if (changeNum < array.length / 2) {
            int tmpNum;
            tmpNum = array[array.length - changeNum - 1];
            array[array.length - changeNum - 1] = array[changeNum];
            array[changeNum] = tmpNum;
            changeNum++;
            return recursionFlip(array, changeNum);
        }
        return array;
    }

}
