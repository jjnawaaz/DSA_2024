package Revision;

import java.util.Scanner;

public class factorialrecursion {

    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }

        int fact = number * factorial(number - 1);
        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int fact = factorial(number);
        System.out.println(fact);

    }
}
