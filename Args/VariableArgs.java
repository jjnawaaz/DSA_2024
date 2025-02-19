package Args;

public class VariableArgs {
    public static void Names(String...n){
        for(String i: n){
            System.out.print(i+" ");
        }
    }


    public static void main(String[] args) {
        Names("hello","there","What's Up?");
        Names("hello      ",  "     What's Up?");
    }
}
