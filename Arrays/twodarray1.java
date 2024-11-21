package Arrays;

import java.util.Scanner;

public class twodarray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row");
        int row = sc.nextInt();
        System.out.println("enter col");
        int col = sc.nextInt();

        int [][]numbers = new int[row][col];

        System.out.println("Enter the array");

        // Initializing the array 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // Printing the array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
