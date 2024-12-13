import java.util.*;

public class arrays1 {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 7, 4, 5, 6 };
        // My approach
        int middle = (arr.length / 2) + 1;
        int min = arr[0];
        int max = arr[0];
        int mincount = 0;
        int maxcount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                if (i == 0) {
                    mincount = i + 1;
                } else if (i < middle) {
                    mincount = i;
                } else {
                    mincount = arr.length - i;
                }
            }
            if (arr[i] >= max) {
                max = arr[i];
                if (i == 0) {
                    maxcount = i + 1;
                } else if (i < middle) {
                    maxcount = i;
                } else {
                    maxcount = arr.length - i;
                }
            }
        }
        System.out.println(mincount + " " + maxcount);

        int result = mincount + maxcount;
        System.out.println(result);

        // Sorting approach
        Arrays.sort(arr);
        int smallest = arr[0];
        int largest = arr[arr.length - 1];

        int result2 = 2;
        System.out.println(result2);
    }
}
