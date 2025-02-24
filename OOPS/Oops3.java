package OOPS;


class Student{
    int id;
    String name;

    public void printStudent(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
    }
}


public class Oops3 {
    public static void main(String[] args) {
        Student obj = new Student();

        obj.id = 3;
        obj.name = "Junaid";

        obj.printStudent();
    }
}
