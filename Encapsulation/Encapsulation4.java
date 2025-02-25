package Encapsulation;

class Encapsulation{

    private String name;
    private int roll_no;
    private int age;

    public int getAge(){return age;}

    public String getName(){return name;}

    public int getRollNo(){return roll_no;}

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setRollNo(int roll_no){
        this.roll_no = roll_no;
    }
}


public class Encapsulation4 {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();

        e.setName("Aysh");
        e.setAge(21);
        e.setRollNo(123454321);

        System.out.println("Name is : " +e.getName());
        System.out.println("Age is : " +e.getAge());
        System.out.println("Roll No is : " +e.getRollNo());
    }
}
