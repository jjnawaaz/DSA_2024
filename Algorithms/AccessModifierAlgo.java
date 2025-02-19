package Algorithms;

class Testing{
    public String name = "";
    protected int age;
    private String email = "1";
    private String password = "2";

    String getname(){
        return name;
    }

    void setname(String n){
        this.name = n;
    }

    int getAge(){
        return age;
    }

    void setAge(int age){
        this.age = age;
    }

    String getEmail(){
        return email;
    }
    
    void setEmail(String email){
        this.email = email;
    }

    String getPassword(){
        return password;
    }

    void setPassword(String password){
        this.password = password;
    }

    void getDetails(){
        System.out.println("The Details are: "+name+" "+ age +" "+email+" "+password);
    }


}


public class AccessModifierAlgo {
    public static void main(String[] args) {
        Testing obj1 = new Testing();
        obj1.setname("Junaid");
        obj1.setAge(22);

       System.out.println(obj1.name);
       System.out.println(obj1.age);
       
       
    //    System.out.println(obj1.email);
    //    System.out.println(obj1.password);      Cannot Access this because of the access modifier private
        
        
       


        // Set Private Variables
        obj1.setEmail("someemail@something.com");
        obj1.setPassword("Somepassword");

        //Print private variables
        obj1.getEmail();
        obj1.getPassword();


        //Print all details

        obj1.getDetails();    // Use this to access private variables
    }
}
