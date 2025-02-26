// Method Overloading in Polymorphism. Also Called Compile-Time Polymorphism

package Polymorphism;

class Helper{
    static int Multiply(int a , int b){
        System.out.println("From int multiply");
        return a * b;
    }

    static double Multiply(double a, double b){
        System.out.println("From Double Mulitply");
        return a * b;
    }
}


public class polymorphism2 {
    public static void main(String[] args) {
        System.out.println(Helper.Multiply(2,4));
        System.out.println(Helper.Multiply(2.2, 4.4));
    }
}
