package Pattern;

public class pattern4 {
        /*
     * Print this pattern  spaces are not included
     *  
     *      *****
     *      ****
     *      ***
     *      **
     *      *
     */
 public static void main(String[] args) {
    int n = 4;
    for(int i=n;i>=1;i--){
        for(int j=i;j>=1;j--){
            System.out.print("*");
        }
        System.out.println();
    }
 }

}
