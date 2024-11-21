package Homework;

import java.util.Scanner;

public class power {
    public static void calculatePower(double x, double y) {
        double answer = Math.pow(x, y);
        System.out.println("The power is "+answer);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x and y");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        calculatePower(x, y);
    }
}
