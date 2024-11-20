package Homework;

import java.util.Scanner;

public class printeven {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        for(int i = 1; i <= n ; i++){
            if( i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
