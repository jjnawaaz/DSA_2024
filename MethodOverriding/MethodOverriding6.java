package MethodOverriding;


class SuperClass{
    private void privateMethod(){
        System.out.println(" It is a private method in superclass");
    }

    public void publicMethod(){
        System.out.println("It is a public method in superclass");
    } 
}


class SubClass extends SuperClass{
   // It creates a new PRIVATE method for subclass
    private void privateMethod(){
        System.out.println("This is a private method in Subclass");
    }

    //This method overrides the public method in SuperClass
    public void publicMethod(){
        System.out.println("It is a public method in SubClass");
       // Calls the private method in SubClass not SuperClass
        privateMethod();
    }
}


public class MethodOverriding6 {
    public static void main(String[] args) {
        SuperClass s1 = new SuperClass();
        // Calls public method
        s1.publicMethod();

        SubClass s2 = new SubClass();

        s2.publicMethod();   // We call the private method in the public subclass and it gets called
    }
}
