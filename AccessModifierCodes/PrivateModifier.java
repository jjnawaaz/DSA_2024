package AccessModifierCodes;

class A{
    private void display(){
        System.out.println("Displaying from private access modifier method");
    }
}

class PrivateModifier {
    public static void main(String[] args) {
        A obj = new A();

        obj.display();       // Will show a compile time error 
    }    
}
