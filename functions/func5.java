
// Factorial problem but using void and return function instead of int return function..... 

package functions;

import java.util.Scanner;

public class func5 {
    
    public static void Factorial(int n) {
        if(n < 0){
            System.out.println("Invalid Number");
            return;
        }

        int factorial = 1;
        for(int i = n; i>=1; i--){
            factorial = factorial * i;
        }

        System.out.println("The factorial is "+factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        Factorial(n);
    }
}
