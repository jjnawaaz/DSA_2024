package Inheritance;

class Person7{
    int id;
    String name;

    void set_Person(int id, String name){
        try{
            this.id = id;
            this.name = name;
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    void displayPerson(){
        System.out.println(+id+"\n"+name);
    }
}




public class Inheritance7 extends Person7 {
    int sal;
    String desgn;

    void set_Emp(int id, String name, String desgn, int sal){
        try{
            set_Person(id, name);
            this.desgn = desgn;
            this.sal = sal;
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    void disp_Emp(){
        displayPerson();
        System.out.println(desgn+"\n"+sal);
    }

    public static void main(String[] args) {
        Inheritance7 e1 = new Inheritance7();
        e1.set_Emp(1001, "John", "FrontEnd Developer", 15000);
        e1.disp_Emp();
    }
}
