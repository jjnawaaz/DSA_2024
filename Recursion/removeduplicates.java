package Recursion;

public class removeduplicates {
    public static boolean[] arr = new boolean[26];
    public static void removeduplicates(int idx, String str,String newString) {
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char ch = str.charAt(idx);
        if(arr[ch - 'a']){                            // here in condition we dont have to check if its true because it checks for true by default
            removeduplicates(idx + 1, str, newString);
        } else {
            newString = newString + ch;
            arr[ch - 'a'] = true;
            removeduplicates(idx + 1, str, newString);
        }

    }
    
    public static void main(String[] args) {
        String str = "aabcddd";
        int idx = 0;
        removeduplicates(idx, str,"");
    }
}
