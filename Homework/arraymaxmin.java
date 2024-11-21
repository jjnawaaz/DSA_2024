package Homework;

import java.util.Scanner;

public class arraymaxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter the values in the array");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Finding the min and max
        int min = numbers[0];
        int max = numbers[0];
        
        for(int i = 0; i < numbers.length;i++){
            if(numbers[i] < min){
                min = numbers[i];
            } else if(numbers[i]>max){
                max = numbers[i];
            }
        }

        System.out.println("The max is "+max);
        System.out.println("The min is "+min);
    }
}
