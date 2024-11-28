// time complexity should be log(n)

package Recursion;

public class powofx2 {

    public static int calcPow(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        int answer = (n % 2 == 0) ? calcPow(x, n / 2) * calcPow(x, n / 2) : calcPow(x, n / 2) * calcPow(x, n / 2) * x;
        return answer;

    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int answer = calcPow(x, n);
        System.out.println(answer);
    }
}
