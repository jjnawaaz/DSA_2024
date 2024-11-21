package functions;

import java.util.Scanner;

public class func2 {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b values");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println(sum);
    }
}
