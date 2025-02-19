package AccessModifierCodes;

public class Test{
    public void display(){
        System.out.println("Displaying from default access modifier method");
    }
}



class Modifier1 {
   public static void main(String[] args) {
    Test obj1 = new Test();
    obj1.display();
   } 
}
