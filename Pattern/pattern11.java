/*
 *          *****
 *         *****
 *        *****
 *       *****
 *      *****
 *     
 *     
 *      
 *      
 *      
 *      
 * 
 * 
 *      Print this Pattern
 */



package Pattern;

public class pattern11 {
    public static void main(String[] args) {
        int n = 5;
        int spaces = 0;
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
