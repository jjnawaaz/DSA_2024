// Comparator Interface  
/**
 * Comparator interface in Java is used to order the objects of user-defined classes. 
 * A comparator object is capable of comparing two objects of the same class. 
 * Following function compare obj1 with obj2.
 * 
 * 
 * Sort Collections using collection class Example
 */

package Comparator;

import java.util.*;

class Student1{
    int roll_no;
    String name;

    Student1(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }

    // Overriding the toString() method
    @Override
    public String toString(){
        return roll_no+": "+name;
    }
}



class SortByRollNo implements Comparator<Student1>{
    
    // Compare by roll_no in ascending order
    public int compare(Student1 a, Student1 b){
        return a.roll_no - b.roll_no;
    }
}


public class Comparator1 {
public static void main(String args[]){
    List<Student1> students = new ArrayList<>();

    students.add(new Student1(114, "Donald"));
    students.add(new Student1(115, "Elon"));
    students.add(new Student1(111, "Proton"));
    students.add(new Student1(109, "Neutron"));


    // Sort Students by roll number
    Collections.sort(students, new SortByRollNo());

    System.out.println("Sorted By Roll Number");

    for(int i = 0; i < students.size(); i++){
        System.out.println(students.get(i));
    }

}
}
