/**
 * Sort collection by more than one field
 */

package Comparator;
import java.util.*;


class Student2{
    String name;
    Integer age;

    Student2(String name, Integer age){
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }

    @Override
    public String toString(){
        return name+ " : "+age;
    }
}


class CustomerSortingComparator implements Comparator<Student2>{
    public int compare(Student2 customer1, Student2 customer2){
        // Compare first by name and then by age 
        int NameCompare = customer1.getName().compareTo(customer2.getName());

        int AgeCompare = customer1.getAge().compareTo(customer2.getAge());

        return (NameCompare == 0) ? AgeCompare : NameCompare;
    }
}


public class Comparator2 {
    public static void main(String[] args) {
        List<Student2> students = new ArrayList<>();

        students.add(new Student2("Ajay",27));
        students.add(new Student2("Sneha", 23));
        students.add(new Student2("Simran", 37));
        students.add(new Student2("Ankit", 22));
        students.add(new Student2("Anshul", 29));
        students.add(new Student2("Sneha", 22));
        
        
        System.out.println("Original List");

        //Iterating List
        for(Student2 it: students){
            System.out.println(it);
        }

        // Sort Using Collections 
        // using the CutomerSortingComparator
        Collections.sort(students, new CustomerSortingComparator());

        System.out.println("After Sorting");

        for(Student2 it: students){
            System.out.println(it);
        }
    }
}
