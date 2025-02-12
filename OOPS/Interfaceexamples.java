package OOPS;

interface Car{
    int age = 44;
    String city = "Hyderabad";        // Not recommended to use variables in interfaces
    void start();
    void stop();
}

class BRV implements Car{
    public void start(){
        System.out.println("Car Started");
    }
    public void stop(){
        System.out.println("Car Stopped");
    }
}



public class Interfaceexamples {
    public static void main(String args[]){
        BRV obj1 = new BRV();

        obj1.start();
        obj1.stop();
        System.out.println(BRV.age);
        System.out.println(BRV.city);
    }
}
