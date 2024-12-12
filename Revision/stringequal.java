package Revision;

import java.util.Scanner;

public class stringequal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first string");
        String strinput1 = sc.nextLine();
        StringBuilder str1 = new StringBuilder(strinput1);
        System.out.println("Enter your second string");
        String strinput2 = sc.nextLine();
        StringBuilder str2 = new StringBuilder(strinput2);

        if (str1 == str2) {
            System.out.println("Equal Strings");
        } else {
            System.out.println("Inequal Strings");
        }

        System.out.println("After if check");

        if (str1.toString().compareTo(str2.toString()) == 0) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        System.out.println("After second if check");

        if (str1.toString().equals(str2.toString())) {
            System.out.println("Strings Equal");
        } else {
            System.out.println("Strings are not equal");
        }

    }
}
