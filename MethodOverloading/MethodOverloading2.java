// Compile Time Polymorphism, Static Polymorphism, or Early binding

// Method - 1. Changing the Number of Parameters

package MethodOverloading;

class Product{
    // Multiply Two Integers
    public int multiply(int a , int b){
        
        return a * b;
    }

    // Multiply Three Integers
    public int mulitply(int a, int b, int c){
        return a * b * c;
    }


}


public class MethodOverloading2 {
    public static void main(String[] args) {
        Product pr = new Product();
        int prod1 = pr.multiply(1,2);
        System.out.println("Product of two integers is "+prod1);

        prod1 = pr.mulitply(1, 2, 3);

        System.out.println("Product of three integers is "+prod1);
    }
}
