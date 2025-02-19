package Input;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        
        // Creating a Scanner class Object
        Scanner sc = new Scanner(System.in);

        // Enter first input 
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        //Enter Second input 
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();


        System.out.println("Sum is: "+(a+b));
    }
}
