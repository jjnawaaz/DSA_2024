package Arrays;

import java.util.Scanner;

public class findtwodarray {
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

        System.out.println("Enter the value to find: ");
        int value = sc.nextInt();
        int index1 = 0;
        int index2 = 0;
        boolean found = false;
        
        // Finding the element
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(value == numbers[i][j]){
                    found = true;
                    index1 = i;
                    index2 = j;
                    break;
                }
            }
        }

        if(found){
            System.out.println("The value is found at index "+index1+","+index2);
        } else {
            System.out.println("The value is not found");

        }
    }
}

