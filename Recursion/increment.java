package Recursion;

public class increment {

    public static void increment(int n, int i) {
        if (i == n) {
            System.out.print(i);
            return;
        }
        System.out.print(i + " ");
        increment(n, i + 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int i = 0;
        increment(n, i);
    }
}
