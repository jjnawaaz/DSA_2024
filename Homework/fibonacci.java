package Homework;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.print(first+" ");
        System.out.print(second+" ");
        for(int i = 2; i < n; i++){
            int fibo = first + second;
            first = second;
            second = fibo;
            System.out.print(fibo+" ");
        }
    }
}
