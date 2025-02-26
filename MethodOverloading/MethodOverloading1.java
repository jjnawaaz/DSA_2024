// Compile Time Polymorphism

package MethodOverloading;


public class MethodOverloading1 {
    
    // Takes two parameters
    public int sum(int x, int y){ return x + y;}
    
   
    // Takes 3 parameters 
    public int sum(int x, int y,int z){ return x + y + z;}

    public double sum(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        MethodOverloading1 s = new MethodOverloading1();
        System.out.println(s.sum(1,2));
        System.out.println(s.sum(1,2,3));
        System.out.println(s.sum(1.5,3.5));
    }
}
