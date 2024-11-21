package functions;

import java.util.Scanner;

public class func4 {
    
    public static int Factorial(int n) {
        int factorial = 1;
        for(int i = n; i >= 1; i--){
            factorial = factorial * (i);
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int fact = Factorial(n);
        System.out.println("The factorial is :"+fact);
    }
}


// 4  4*3*2*1