// Use of Object and class

package OOPS;

public class Oops1 {
    // Properties
    private int a;
    private int b;

    //Methods
    public void sum(){ System.out.println(a+b);}
    public void sub(){ System.out.println(a-b);}
    
    
    
    public static void main(String[] args) {
       // Creating Instance of Objects
       // Object 
       Oops1 obj = new Oops1();

        // Assigning values 
        obj.a = 1;
        obj.b = 2;

        //Using Methods
        obj.sum();
        obj.sub();
    }
}
