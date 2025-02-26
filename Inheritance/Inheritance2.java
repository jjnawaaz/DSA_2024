package Inheritance;

class Employee{
    int salary = 60000;
}

class Engineer extends Employee{
    int benefits = 10000;
}


public class Inheritance2 {
    public static void main(String[] args) {
        
        // Inherited Employee attributes Engineer object creation
        Engineer e1 = new Engineer();
        System.out.println("Salary is "+e1.salary+"\nBenefits are "+e1.benefits);

        // Normal Employee Class creation
        Employee e2 = new Employee();
        System.out.println("Salary of employee is "+e2.salary);
    }
}
