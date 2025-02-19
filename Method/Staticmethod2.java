package Method;

public class Staticmethod2 {
    static void greet(){
        System.out.println("Greetings");
    }

    public static void main(String[] args) {
        // Calling the static method using name 
        greet();


        // Calling method using classname 
        Staticmethod2.greet();
    }
}
