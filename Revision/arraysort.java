package Revision;

import java.util.Scanner;

public class arraysort {
    public static void main(String[] args) {
        // size 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        //Initialize the array
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // Print unsorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // Logic to sort in ascending
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                // check if min is greater if greater then swap
                if(arr[j] < min){
                   int temp = arr[minIndex];      // Use the temp variable to assign it to the bigger value
                   arr[minIndex] = arr[j];       // initialize the current index with the lesser value
                   min = arr[minIndex];         // initialize the min value with lesser value
                   arr[j] = temp;              // replace the arr[j + 1] value with min
                }
             }
        }


        // Print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
