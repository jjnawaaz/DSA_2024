package Revision;

import java.util.*;

public class selectionsort {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 3, 2, 6, 1, 9, 7, 8 };

        // selection_sort
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // print_array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}