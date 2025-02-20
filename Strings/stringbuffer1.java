package Strings;

public class stringbuffer1 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        s.append("j");
        s.append("j");

        StringBuffer s1 = new StringBuffer();
        s1.append("j");
        s1.append("j");


        // Throws not equal
        if(s == s1){
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        // Cannot use toCompare to StringBuffer
        // Error: The method toCompare(StringBuffer) is undefined for the type StringBuffer
        // if(s.toCompare(s1) == 0){
        //     System.out.println("Compared");
        // }

        System.out.println(s);
        System.out.println(s1);
    }
}
