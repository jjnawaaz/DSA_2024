// Example 1

package Abstraction;

abstract class Shape{
    String color;

    // Abstract Methods
    abstract double area();
    public abstract String toString();

    // Abstract Constructor
    public Shape(String color){
        System.out.println("Shape Constructor called");
        this.color = color;
    }

    // this is a concrete method
    public String getColor(){return color;}

}

class Circle extends Shape{
    double radius;

    public Circle(String color,double radius){
        // Calling Shape constructor
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override 
    double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString(){
        return "Circle color is : "+super.getColor()+" and area is : "+area();
    }
}


class Rectangle extends Shape{

    double length;
    double breadth;

    public Rectangle(String color, double length, double breadth){
        // Calling shape constructor
        super(color);
        System.out.println("Rectangle constructor called ");
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area(){ return length * breadth;}

    @Override
    public String toString(){
        return "Rectangle color is : "+super.getColor()+" and area is : "+area();
    }
}


public class Abstract2 {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red", 2);
        Shape s2 = new Rectangle("Blue", 4, 2);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
