package Homework;

import java.util.Scanner;

public class avg {
   
    public static void Average(int a, int b, int c) {
        int average = (a+b+c)/3;
        System.out.println("The average of 3 numbers is :" +average);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a b and c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Average(a, b, c);
    }
}
