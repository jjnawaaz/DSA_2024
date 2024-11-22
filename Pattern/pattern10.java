/*
 *      *      *
 *      **    **
 *      ***  ***
 *      ********
 *      ********
 *      ***  ***
 *      **    **
 *      *      *
 * 
 * 
 *      Print this Pattern
 */






package Pattern;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        
        // Upper Half
        for( int i = 1; i<=n;i++){
            // 1st Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <=2*(n - i); j++) {
                System.out.print(" ");
            }
            // Last Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower Half
        for( int i = n; i>=1;i--){
            // 1st Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <=2*(n - i); j++) {
                System.out.print(" ");
            }
            // Last Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
