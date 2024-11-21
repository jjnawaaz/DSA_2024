package Homework;

import java.util.Scanner;

public class greater {
    public static void Greater(int a, int b) {
        if(a>b){
            System.out.println("The value greater is "+a);
        } else {
            System.out.println("The value greater is "+b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        Greater(a, b);
    }
}
