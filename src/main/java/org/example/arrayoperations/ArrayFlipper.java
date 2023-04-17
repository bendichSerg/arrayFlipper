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

    public int[] recursionFlip(int[] array, int changeNum) {
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


//public class ArrayFlipper {
//    static int i = 0;
//    public int[] flip(int[] array) {
//        if (array == null || array.length == 0) {
//            return new int[0];
//        }
//        int tmpNum;
//        for (int i = 0; i < array.length / 2 ; ++i) {
//            tmpNum = array[array.length - i - 1];
//            array[array.length - i - 1] = array[i];
//            array[i] = tmpNum;
//        }
//        return flip(array);
//    }
//
//}
