// Initializing array by taking the size from the user

package Arrays;

import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter the array values");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}
