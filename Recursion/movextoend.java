package Recursion;

public class movextoend {

    public static void moveX(String str, int idx, String newString, int count) {
        
        if(idx == str.length()){
            for (int i = 0; i < count; i++) {
                newString = newString + 'x';
            }
            System.out.println(newString);
            return;
        }

        char ch = str.charAt(idx);
        if(ch == 'x'){
            count++;
            moveX(str, idx + 1, newString, count);
        } else {
            newString = newString + ch;
            moveX(str, idx + 1, newString, count);
        }
    }
    public static void main(String[] args) {
        String str = "axbxcxd";
        int idx = 0;
        int count = 0;
        String newString = "";
        moveX(str, idx, newString, count);    
}
}
