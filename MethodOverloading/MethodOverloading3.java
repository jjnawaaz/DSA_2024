// Compile Time Polymorphism, Static Polymorphism, or Early binding

// Method - 2. Changing Data Types of the Arguments


package MethodOverloading;

class Helper1{
    public int product(int a, int b){
        return a * b;
    }

    public double product(double a, double b){
        return a * b;
    }
}

public class MethodOverloading3 {
    public static void main(String[] args) {
        Helper1 h = new Helper1();
        System.out.println("The product of integers is "+h.product(1, 3));
        System.out.println("The product of doubles is "+h.product(1.5, 3.7));
    }
}
