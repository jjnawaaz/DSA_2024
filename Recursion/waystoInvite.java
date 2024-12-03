package Recursion;

public class waystoInvite {

    public static int waysCount(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        // if (n <= 1) {
        // return 1;
        // }

        // Single
        int singleCount = waysCount(n - 1);
        // Pair Count
        int pairCount = (n - 1) * waysCount(n - 2);
        return singleCount + pairCount;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(waysCount(n));
    }
}
