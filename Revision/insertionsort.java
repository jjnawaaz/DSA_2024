package Revision;

public class insertionsort {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 6, 1, 2 };
        // iterating the array
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j;
            for (j = i - 1; j >= 0 && current < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = current;
        }

        // Printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
