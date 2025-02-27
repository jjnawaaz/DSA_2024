// Marker Interface 

package MarkerInterface;

interface Test1{

}

class Person1 implements Test1{
    public Person1(){
        System.out.println("Person object created");
    }
}

class Animal1{
    public Animal1(){
        System.out.println("Animal Object Created");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Person1 person = new Person1();
        Animal1 animal = new Animal1();

        if(person instanceof Test1){
            System.out.println("Person is from interface Test1");
        } else {
            System.out.println("Person is not from interface Test1");
        }

        if(animal instanceof Test1){
            System.out.println("Animal is from interface Test1");
        } else{
            System.out.println("Animal is not from interface Test1");
         }
    }
}
