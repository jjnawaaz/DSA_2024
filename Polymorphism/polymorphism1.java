/**
 * The word ‘polymorphism’ means ‘having many forms’. 
 * In Java, polymorphism refers to the ability of a message to be displayed in more than one form. 
 * This concept is a key feature of Object-Oriented Programming and it allows objects to behave differently based on their specific class type.
 * Real-life Illustration of Polymorphism in Java: A person can have different characteristics at the same time. Like a man at the same time is a father, a husband, and an employee. So the same person possesses different behaviors in different situations. This is called polymorphism.
 * 
 */

package Polymorphism;

class Person{
    void role(){
        System.out.println("Iam a person");
    }
}


class Father extends Person{
    @Override
    void role(){
        System.out.println("Iam a father");
    }
}

class Employee extends Person{
    @Override
    void role(){
        System.out.println("Iam an employee");
    }
}

public class polymorphism1 {
    public static void main(String[] args) {
        Person p = new Father(); // Person class is now a Father
        Person p1 = new Employee(); // Same Person class is now a Employee

        p.role();
        p1.role();
    }
}
