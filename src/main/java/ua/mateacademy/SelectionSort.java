package ua.mateacademy;

/**
 * Created by Таня on 21.12.2018.
 */
public class SelectionSort {
    static int[] array = {6, 4, 1, 5, 7, 2, 8, 3, 9};

    public static void sort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
