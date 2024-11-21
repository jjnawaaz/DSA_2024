package Homework;

import java.util.Scanner;

public class arrayascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[5];
        System.out.println("Enter 5 array values");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        boolean flag = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] > numbers[i + 1]){
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("The array is in ascending order");
        } else {
            System.out.println("The array is not in ascending order");
        }
    }
}
