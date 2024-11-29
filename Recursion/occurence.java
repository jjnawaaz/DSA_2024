/*
 * Find the first and last occurence of a letter in a string
 */

package Recursion;

public class occurence {
    public static int first = -1;
    public static int last = -1;
    public static void findOccurence(String str, int idx, char ch) {
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        
        
        char element = str.charAt(idx);
        if( element == ch){
            if(first == -1){
                first = idx;
            } else {
                last = idx;
            }
        }

        findOccurence(str, idx + 1, ch);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaha";
        int idx = 0;
        findOccurence(str, idx,'a');
    }
}
