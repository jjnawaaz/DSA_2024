package Interfaces;

interface Vehicle {
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);    
}

class Bicycle implements Vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    // Increase Speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }


    // Decrease Speed
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates(){
        System.out.println("Speed is : "+speed+"\nGear is : "+gear);
    }
}

class Bike implements Vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    // Increase Speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }


    // Decrease Speed
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates(){
        System.out.println("Speed is : "+speed+"\nGear is : "+gear);
    }
}

public class Interface3 {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        Bike a = new Bike();
        b.changeGear(2);
        b.speedUp(3);
        b.applyBrakes(1);

        System.out.println("Bicycle data: ");
        b.printStates();

        a.changeGear(5);
        a.speedUp(80);
        a.applyBrakes(35);

        System.out.println("Bike details : ");
        a.printStates();
    }
}
