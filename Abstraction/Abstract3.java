// Example 2
package Abstraction;

abstract class Animal{
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void makeSound();
    public String getName(){
        return name;
    }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    public void makeSound(){
        System.out.println(getName() + " barks ");
    }
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    public void makeSound(){
        System.out.println(getName() + " meows ");
    }
}


public class Abstract3 {
    public static void main(String[] args) {
        Animal animal1 = new Dog("Kuchimaa");
        Animal animal2 = new Cat("Pucchimaa");

        animal1.makeSound();
        animal2.makeSound();
    }
}
