package Homework;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        String names[] = new String[size];

        System.out.println("Enter the names in the array: ");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+" ");
        }

    }
}
