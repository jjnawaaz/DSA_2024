package Homework;

import java.util.Scanner;

public class oddfunc {
   
   public static void Sum(int n) {
        int sum = 0;
        for(int i =0; i < n; i++){
            if(i%2 != 0){
                sum = sum + i;
            } 
        }

        System.out.println("The sum of odd numbers from 1 to "+n+" is "+sum);
        return;
   }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of n"); 
       int n = sc.nextInt();
        Sum(n);
    }
}
