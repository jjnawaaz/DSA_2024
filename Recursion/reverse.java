package Recursion;

import java.util.Scanner;

public class reverse {

    public static void reverse(String str, int index) {
        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        index--;
        reverse(str, index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = sc.next();
        System.out.println("Given String " + str);
        int index = str.length() - 1;
        System.out.print("The reversed String is ");
        reverse(str, index);

    }
}
