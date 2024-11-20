package Pattern;

public class pattern2 {
    /*
     * Print this pattern  spaces are not included
     *  
     *      *****
     *      *****
     *      *****
     *      *****
     *      *****
     */

   public static void main(String[] args) {
    int n = 4;
    for(int i = 0; i < n ; i++){
       for(int j = 0; j < 5; j++){
           System.out.print("*");
       }
       System.out.println();
    }
   }
}
