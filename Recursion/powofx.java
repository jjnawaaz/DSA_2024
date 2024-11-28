// Time Complexity should be n

package Recursion;

public class powofx {

    public static int calcpowofx(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int answer = x * calcpowofx(x, n - 1);
        return answer;

    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int answer = calcpowofx(x, n);
        System.out.println(answer);
    }
}
