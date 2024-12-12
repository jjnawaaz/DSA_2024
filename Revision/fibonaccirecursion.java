package Revision;

import java.util.Scanner;

public class fibonaccirecursion {

    public static void printFibonacci(int n, int first, int second) {
        if (n == 0) {
            return;
        }
        int result = first + second;
        System.out.print(" " + result);
        printFibonacci(n - 1, second, result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second);
        n = n - 2;
        printFibonacci(n, first, second);

    }
}
