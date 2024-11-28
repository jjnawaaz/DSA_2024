package Recursion;

public class sumofn {
    public static int calcSum(int n) {
        // base case
        if (n == 0) {
            return 0;
        }
        int sum = n + calcSum(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        int answer = calcSum(n);
        System.out.println(answer);
    }
}
