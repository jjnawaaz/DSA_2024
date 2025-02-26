// Overridden Methods mus have return types after Java 5.0
/**
 * From Java 5.0 onwards it is possible to have different return types for an overriding method in the child class, 
 * but the child’s return type should be a sub-type of the parent’s return type. 
 * This phenomenon is known as the covariant return type.
 */

package MethodOverriding;

class Parent7{
    public Object show(){
        System.out.println("From parent");
        return new Object();
    }
}

class Child7 extends Parent7{
    
   public String show(){
        System.out.println("From Child");
        return "Hi there";
        // Covariant type here
    }
}

public class MethodOverriding7 {
    public static void main(String[] args) {
        Parent7 obj1 = new Parent7();
        obj1.show();

        Child7 obj2 = new Child7();
        obj2.show();
    }
}
