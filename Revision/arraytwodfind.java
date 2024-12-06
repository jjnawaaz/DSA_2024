package Revision;

import java.util.Scanner;

public class arraytwodfind {
    public static void main(String[] args) {
        // Size 
        System.out.println("Enter the row size of the array");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        System.out.println("Enter the column size of the array");
        int column = sc.nextInt();

        // Enter the details in array and initialize array
        int arr[][] = new int[row][column];
        System.out.println("Enter the elements in the array");

        //Entering elements in the 2d array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        // Find the element in the array 
        System.out.println("Enter the element to find in the array");
        int element = sc.nextInt();
        boolean flag = false;
        //Logic to find the element in the array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(arr[i][j]==element){
                    flag = true;
                }
            }
        }

        if(flag){
            System.out.println("The element is found in the 2d array");
        }else{
            System.out.println("The element is not found in the 2d array");
        }
    }
}
