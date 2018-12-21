package ua.mateacademy;

import java.util.Arrays;

/**
 * Created by Таня on 21.12.2018.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Bubble sort: ");
        System.out.println(Arrays.toString(BubbleSort.array));
        BubbleSort.sort(BubbleSort.array);
        System.out.println(Arrays.toString(BubbleSort.array));
        System.out.println("//////////////////////////////");
        System.out.println("Selection sort: ");
        System.out.println(Arrays.toString(SelectionSort.array));
        SelectionSort.sort(SelectionSort.array);
        System.out.println(Arrays.toString(SelectionSort.array));
    }
}
