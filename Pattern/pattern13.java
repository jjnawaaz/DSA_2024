/*
 *      
 *     1
 *    212
 *   32123
 *  4321234  
 * 543212345   
 *      
 * 
 * 
 *      Print this Pattern 
 */





package Pattern;

public class pattern13 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // for numbers
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }

            // for second part loop starts from i == 2
                for (int j = 2; j <= i; j++){
                    System.out.print(j);
                }
            

            System.out.println();
        }
    }
}
