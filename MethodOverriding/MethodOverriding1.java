// Method Overriding 

package MethodOverriding;


class Animal{
    
    void move(){
        System.out.println("Animal is Moving");
    }
    void eat(){
        System.out.println("Animal is Eating");
    }
}


class Dog extends Animal{
    @Override
    void move(){
        System.out.println("Dog is moving");
    }


    void bark(){
        System.out.println("Dog is barking");
    }
}


public class MethodOverriding1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.move();
        d.eat();
        d.bark();
    }
}
