package ua.mateacademy;

import java.util.Arrays;

/**
 * Created by Таня on 21.12.2018.
 */
public class BubbleSort {
    static int[] array = {6, 4, 1, 5, 7, 2, 8, 3, 9};

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
}
