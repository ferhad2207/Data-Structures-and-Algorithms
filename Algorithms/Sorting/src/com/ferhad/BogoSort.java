package com.ferhad;

import java.util.Random;

/**
 * @author Ferhad Mehdizade
 *
 * Bogo Sort Algorithm(Very bad, but funny way to sort array)
 */
public class BogoSort {
    /**
     * Chooses 2 random indices in the array, and swap them, until whole array will be sorted
     * @param arr array
     * @param <T> generic type
     */
    public static <T extends Comparable<T>> void bogoSort(T[] arr) {
        Random rand = new Random();
        while (!isSorted(arr, 0)) {
            int index1 = rand.nextInt(arr.length);
            int index2 = rand.nextInt(arr.length);
            T temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
    }

    /**
     * Checks whether the array is sorted or not
     * @param arr array
     * @param index current index of the array(because of the recursive function)
     * @param <T> generic type
     * @return true if the array is sorted, otherwise false
     */
    private static <T extends Comparable<T>> boolean isSorted(T[] arr, int index) {
        if (index == arr.length - 1)
            return true;
        return arr[index].compareTo(arr[index + 1]) <= 0 &&
                isSorted(arr, index + 1);
    }
}
