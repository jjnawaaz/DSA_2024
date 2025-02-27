// Multiple Inheritance of Interfaces by Class
package InterfaceInheritance;

interface intfA{
    void m1();
}

interface intfB{
    void m2();
}

class Sample implements intfA,intfB{
    @Override
    public void m1(){
        System.out.println("Inside m1()");
    }
    @Override
    public void m2(){
        System.out.println("Inside m2()");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.m1();
        s.m2();
    }
}
