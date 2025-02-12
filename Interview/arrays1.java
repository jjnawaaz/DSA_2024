import java.util.*;

public class arrays1 {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 6, 4, 5, 7 };

        // My approach
        int middle = (arr.length / 2) + 1;
        int min = arr[0];
        int max = arr[0];
        int mincount = 0;
        int maxcount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                if (i < middle) {
                    mincount = i;
                } else {
                    mincount = arr.length - i - 1;
                }
            }
            if (arr[i] >= max) {
                max = arr[i];
                if (i < middle) {
                    maxcount = i;
                } else {
                    maxcount = arr.length - i - 1;
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

        int result2 = 0;
        System.out.println(result2);
    }
}
