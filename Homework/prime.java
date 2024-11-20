package Homework;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        if(n == 1){
            System.out.println("It is neither prime nor composite");
            return;
        } 
        boolean isPrime = true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(n+" is a prime number");
        } else {
            System.out.println(n+" is not a prime number");
        }
    }
}
