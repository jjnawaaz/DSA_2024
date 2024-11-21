package Homework;

import java.util.Scanner;

public class circumference {
    
    public static void calculateCircumference(float radius) {
        if( radius < 0){
            System.out.println("Invalid radius");
            return;
        }
        double circumference = radius * 3.14 * 2;
        System.out.println("The circumference of the circle is "+circumference);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        float radius = sc.nextFloat();
        calculateCircumference(radius);
    }
}
