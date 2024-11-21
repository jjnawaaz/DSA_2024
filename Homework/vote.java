package Homework;

import java.util.Scanner;

public class vote {
    
    public static void voteRights(int age) {
        if(age > 18){
            System.out.println("The person is eligible to vote");
        } else {
            System.out.println("The person is not eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        voteRights(age);
    }
}
