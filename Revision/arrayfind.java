package Revision;

import java.util.Scanner;

public class arrayfind {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        
        // Intialize array size and array
        int size = sc.nextInt();
        int arr[] = new int[size];

        // entering the details in the array 
        System.out.println("Enter the integers in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.print(arr[i]+" ");
        }

        // Enter the element to find in the array
        System.out.println("Enter the element to find in the array");
        int element = sc.nextInt();
        System.out.println("The element to search is "+element);

        // Logic to find the element in the array
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element){
                flag = true;
            }
        } 

        if(flag){
            System.out.println("The element is found");
        } else{
            System.out.println("Element is not found");
        }


    }
}
