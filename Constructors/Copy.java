// Copy COnstructor

package Constructors;

class C {
    String name;
    int id;

    C(String name, int id){
        this.name = name;
        this.id= id;
    }

    //Copy Constructor
    C( C obj){
        this.name = obj.name;
        this.id = obj.id;
    }
}

public class Copy {
    public static void main(String[] args) {
        System.out.println("First Object");
        C obj1 = new C("Junaid",24);
        System.out.println("First Object: "+obj1.name+" "+obj1.id);
        System.out.println();
        //Copy
        C obj2 = new C(obj1);
        System.out.println("Second Object: "+obj2.name+" "+obj2.id);

    }
}
