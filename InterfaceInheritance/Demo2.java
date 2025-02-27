package InterfaceInheritance;


interface Interface1{
    void name();
}

interface Interface2{
    void Institute();
}

interface Interface3 extends Interface1,Interface2{
    void Branch();
}

public class Demo2 implements Interface3 {
    public void name(){
        System.out.println("John");
    }

    public void Institute(){
        System.out.println("BITS");
    }

    public void Branch(){
        System.out.println("CSE");
    }

    public static void main(String[] args) {
        Demo2 d = new Demo2();

        d.name();
        d.Institute();
        d.Branch();
    }
}
