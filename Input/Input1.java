package Input;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter your Name 
        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("Using next: "+name);

        sc.close();
    }
}
