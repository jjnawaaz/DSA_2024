package Constructors;

class A{
    String name;
    int id;

    A(String name, int id){
        this.name = name;
        this.id = id;
    }
}


public class Parameterized {
    public static void main(String[] args) {
        A obj1 = new A("Junaid",24);
        System.out.println(obj1.name+" "+obj1.id);
    }
}
