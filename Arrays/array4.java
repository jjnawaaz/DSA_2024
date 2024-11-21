package Arrays;

import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter the array values");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Search the value 
        System.out.println("Enter the value to search");
        int value = sc.nextInt();
        boolean found = false;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == value){
                found = true;
                index = i;
            }
        }

        if(found) {
            System.out.println("The number is found at index "+index);
        } else {
            System.out.println("The number is not found");
        }
    }
}

