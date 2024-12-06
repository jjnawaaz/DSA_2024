package Revision;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        // Enter the number to calculate the fact
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate fact");
        int number = sc.nextInt();

        int fact = 1;

        // Logic to calculate factorial
        for(int i = number; i >= 1; i--){
            fact = fact * i;
        }

        System.out.println("The factorial of the number "+number+" is "+fact);
    }
}
