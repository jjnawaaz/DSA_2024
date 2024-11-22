/*
 * 
 *    *
 *   ***
 *  *****
 * *******
 * *******  
 *  ***** 
 *   ***
 *    *
 * 
 * 
 * 
 */





package Pattern;

public class pattern14 {
    public static void main(String[] args) {
        int n = 4;
      
        
        // Upper Diamond
        for (int i = 1; i <= n; i++) {
            // spaces 
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= 2*i - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
           
        }
       
        //Lower Diamond
        for (int i = n; i >= 1; i--) {
            // spaces 
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= 2*i - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
           
        }
    }
}
