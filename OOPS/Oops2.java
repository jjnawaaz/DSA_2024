// Static 

package OOPS;

public class Oops2 {
    static String Employee_name;
    static float Employee_salary;

    static void set(String n, float p){
        Employee_name = n;
        Employee_salary = p;
    }

    static void get(){
        System.out.println(Employee_name+" "+Employee_salary);
    }

    public static void main(String[] args) {
        Oops2.set("Junaid", 9999.9f);
        Oops2.get();
    }
}
