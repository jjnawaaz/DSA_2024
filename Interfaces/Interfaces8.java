package Interfaces;


interface Bank{
    void deposit();
    void withdraw();
    void loan();
    void account();
}


abstract class Dev1 implements Bank{
    public void deposit(){
        System.out.println("Your deposited amount is : "+100);
    }
}

abstract class Dev2 extends Dev1{
    public void withdraw(){
        System.out.println("Your withdraw amount is : "+50);
    }
}

class Dev3 extends Dev2{
    public void loan(){}
    public void account(){}
}

public class Interfaces8 {
    public static void main(String[] args) {
        Dev3 d = new Dev3();
        d.account();
        d.loan();
        d.deposit();
        d.withdraw();
    }
}
