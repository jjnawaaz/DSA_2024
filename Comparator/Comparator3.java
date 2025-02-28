// Alternative Method
package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student3{
    String name;
    Integer age;

    Student3(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    } 

    public Integer getAge(){
        return age;
    }

    @Override
    public String toString(){
        return name+" : "+age;
    }
}


public class Comparator3 {
    public static void main(String[] args) {
        List<Student3> students = new ArrayList<>();
        students.add(new Student3("Ajay", 27));
        students.add(new Student3("Sneha", 23));
        students.add(new Student3("Simran", 37));
        students.add(new Student3("Ankit", 22));
        students.add(new Student3("Anshul", 29));
        students.add(new Student3("Sneha", 22));

        System.out.println("Original List");

        for(Student3 it: students){
            System.out.println(it);
        }
        System.out.println();

        // Alternative method to sort collections first by name and then by age 
        students.sort(Comparator.comparing(Student3::getName).thenComparing(Student3::getAge));

        System.out.println("After Sorting");

        for(Student3 it: students){
            System.out.println(it);
        }

    }
}
