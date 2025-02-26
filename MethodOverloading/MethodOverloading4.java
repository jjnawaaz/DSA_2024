// Compile Time Polymorphism, Static Polymorphism, or Early binding

// Method - 3. Changing the Order of the Parameters of Methods

package MethodOverloading;


class Student{
    public void StudentDetails(String name, int roll_no){
        System.out.println("Name : "+name+"\nRoll-no : "+roll_no);
    }

    public void StudentDetails(int roll_no, String name){
        System.out.println("Roll-no : "+roll_no+"\nName : "+name);

    }
}


public class MethodOverloading4 {
    public static void main(String[] args) {
        Student s = new Student();
        s.StudentDetails(123, "JJ");
        s.StudentDetails("Hi There", 321);
    }
}
