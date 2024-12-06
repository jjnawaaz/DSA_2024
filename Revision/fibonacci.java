package Revision;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of fibonacci values to print");
        int number = sc.nextInt();

        //print 0 and 1 first
        System.out.print("0 ");
        System.out.print("1");
        int prev = 0;
        int current = 1;
        for (int i = 2; i < number; i++) {
           int temp = current;
           current = prev + current;
           prev = temp; 
           System.out.print(" "+current);
        }
    }
}
