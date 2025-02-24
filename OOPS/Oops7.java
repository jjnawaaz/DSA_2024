// Method Overloading and Method Overriding

package OOPS;


class Parent{
    // Method Declared
    public void func(){
        System.out.println("Parent Method Func");
    }

    //Method Overriding
    public void func(int a){
        System.out.println("Parent Overriding Method" +a);
    }

}

class Child extends Parent{
   //Method Overriding
   @Override
   public void func(int a){
       System.out.println("Child Method " +a);
   }
}
public class Oops7 {
 
public static void main(String[] args) {
    
    Parent obj1 = new Parent();
    // Calls Normal Parent methods
    obj1.func();
    obj1.func(1);

    Parent obj3 = new Child();
    //Calls Parent Methods only even if Child()
    obj1.func();
    obj1.func(5);
   
    // Calls Child Method
    Child obj2 = new Child();
    obj2.func(2);
}
}
