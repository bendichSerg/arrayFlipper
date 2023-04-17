package org.example.arrayoperations;

import java.util.Scanner;

public class ArrayFlipper {
    private static final int LEN_ARRAY = 5;
    private final int[] array = new int[LEN_ARRAY];

    public ArrayFlipper(){
        System.out.println(("Write array of integer numbers with size " + LEN_ARRAY));
        Scanner scanner = new Scanner(System.in);
        for ( int i = 0; i < LEN_ARRAY; ++i){
            this.array[i] = scanner.nextInt();
        }
    }

    public void flip(){
        int flipLen = LEN_ARRAY / 2;
        for( int i = 0; i < flipLen; ++i){
            array[i] = array[i] + array[LEN_ARRAY - i - 1];
            array[LEN_ARRAY - i - 1] = array[i] - array[LEN_ARRAY - i - 1];
            array[i] -= array[LEN_ARRAY - i - 1];
        }
    }

    public void outArray(){
        System.out.println(("Our array"));
        for ( int i : this.array){
            System.out.print(i + " ");
        }
    }
}
