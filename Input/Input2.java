package Input;

import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        
        //Scan the full word
        Scanner sc = new Scanner(System.in);
        
        //Enter full name using nextInt()
         System.out.println("Enter your full name");
         String fullname = sc.nextLine();
         System.out.println("Using nextLine(): "+fullname);   
    }
}
