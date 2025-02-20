// Allocating size to array 


package Arrays;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
       
       int arr[] = new int[10];
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter your array values");

       for(int i = 0; i < arr.length; i++){
        System.out.println("Enter value of "+i+" Element");
        arr[i] = sc.nextInt();
       }

       //print array

       for(int i: arr){
        System.out.print(i+" ");
       }

    }
}
