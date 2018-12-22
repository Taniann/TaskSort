package ua.mateacademy;

import java.util.Arrays;

/**
 * Created by Таня on 21.12.2018.
 */
public class Main {
    private static int[] arrayFirst = {6, 4, 1, 5, 7, 2, 8, 3, 9, 8, 12, -1, 14, 7, 3, -2, 0, -7 ,25, 4, 0};
    private static int[] arraySecond = {4, 8, 1, -9, 12, 4, 5, 0, 17 , 4, 5, 6, 3, 9, 8, -5, 0, 0, 2, 7, 10};



    public static void main(String[] args) {
        System.out.println("Before sorting: " + Arrays.toString(arrayFirst));
        System.out.println("After bubble sorting: " + Arrays.toString(BubbleSort.sort(arrayFirst)));
        System.out.println("Before sorting: " + Arrays.toString(arraySecond));
        System.out.println("After selection sorting: " + Arrays.toString(SelectionSort.sort(arraySecond)));

    }
}
