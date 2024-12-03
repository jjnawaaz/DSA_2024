package Recursion;

public class countpaths {

    public static int countPath(int i, int j, int m, int n) {
        if (i == n || j == m) { // Out of Bounds condition
            return 0;
        }

        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // Down Paths
        int downPaths = countPath(i, j + 1, m, n);

        // Right Paths
        int rightPaths = countPath(i + 1, j, m, n);

        return rightPaths + downPaths;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int i = 1, j = 1;

        int countPaths = countPath(i, j, m, n);
        System.out.println(countPaths);
    }
}

// Time Complexity O(n!)