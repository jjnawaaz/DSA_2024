package Abstraction;


// Abstract Class 
abstract class Remote{
    abstract void turnOn();
    abstract void turnOff();
}

// Concrete Class implementing the abstract methods
class TVRemote extends Remote{
    
    @Override
    void turnOn(){
        System.out.println("TV is turned ON. ");
    }

    @Override
    void turnOff(){
        System.out.println("TV is turned OFF. ");
    }
}



public class Abstract1 {
    public static void main(String[] args) {
        
        // Creates Class using abstract Remote class
        Remote r = new Remote() {
            void turnOn(){
                System.out.println("hello from remote");
            }
            void turnOff(){
                System.out.println("hello from remote");
            }
        };
        r.turnOn();
        r.turnOff();

        // Creates obj remote using the class TV Remote
        Remote remote = new TVRemote();
        remote.turnOn();
        remote.turnOff();
    }
}
