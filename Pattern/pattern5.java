package Pattern;

public class pattern5 {
     /*
     * Print this pattern  spaces are not included
     *  
     *         *
     *        **
     *       ***
     *      ****
     */
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++){
            // FOR SPACES WE HAVE TO CONSIDER n - i SPACES per line
            for(int j = 0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j < i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
