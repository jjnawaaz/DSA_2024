package Recursion;

public class decrement {

    public static void decrement(int n) {

        if (n == 0) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        decrement(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        decrement(n);
    }
}
