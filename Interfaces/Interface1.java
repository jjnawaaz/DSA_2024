// Example 1
package Interfaces;

interface Shape {
    double calculateArea();
}

class Circle implements Shape{
    private double r;

    // constructor for circle 
    public Circle(double r){
        this.r = r;
    }

    // Implementing abstract method from Shape interface
    public double calculateArea(){
        return Math.PI * Math.pow(r,2);
    }
}


class Rectangle implements Shape{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea(){
        return length * breadth;
    }


}



public class Interface1 {
    public static void main(String[] args) {
        Shape s1 = new Circle(2);
        Shape s2 = new Rectangle(3, 4);

        System.out.println(s1.calculateArea());
        System.out.println(s2.calculateArea());
    }
}
