// Encapsulation in Java

package OOPS;

class Employee{
    
    // Private Variables
    private int id;
    private String name;

    //Setter Methods
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    //Getter Methods
    public void getId(){
        System.out.println(id); 
    }

    public void getName(){
        System.out.println(name);
    }

}


public class Oops5 {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setId(3);
        e.setName("Junaid");

        e.getId();
        e.getName();
    }
}
