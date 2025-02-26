// Overloading Main()

package MethodOverloading;

public class MethodOverloading6 {
    public static void main(String[] args) {
        System.out.println("Hi from 1st Main()");
        MethodOverloading6.main("First Main() - ");
    }

    public static void main(String arg1) {
        System.out.println("Hi from 2nd Main()");
        MethodOverloading6.main("Second Main() - ","Third Main() - ");
    }

    public static void main(String arg1, String args2) {
        System.out.println("Hi from third main()"+arg1+args2);
    }
}
