package Revision;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        // initialize the number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if its prime or not");
        int number = sc.nextInt();
        System.out.println("Number entered is "+number);

        // logic to check prime

        boolean flag = false;
        if(number == 1 || number == 0){
            System.out.println("The number is not prime");
            return;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0){
                flag = true;
            }
        }

        //check if prime or not using flag
        if(flag){
            System.out.println("The number is not prime "+number);
        }else{
            System.out.println("The number is prime "+number);
        }
    }
}
