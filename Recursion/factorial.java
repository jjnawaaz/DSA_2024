package Recursion;

public class factorial {

    public static int calcFactorial(int n) {
        // base case
        if (n == 0) {
            return 1;
        }

        int fact = n * calcFactorial(n - 1);
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        int answer = calcFactorial(n);
        System.out.println(answer);
    }
}
