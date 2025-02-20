package Arrays;


class Student{
    public int roll_no;
    public String name;

    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name=name;
    }
}


public class ArrayObjects {
    
   
   public static void main(String[] args) {
    Student[] arr = new Student[5];
    arr[0] = new Student(1,"JJ1");
    arr[1] = new Student(2,"JJ2");
    arr[2] = new Student(3,"JJ3");
    arr[3] = new Student(4,"JJ4");
    arr[4] = new Student(5,"JJ5");

    for(int i = 0; i < arr.length; i++){
        System.out.println("The element at "+i+" is {" +arr[i].roll_no+" "+arr[i].name+" }");
    }

   }
   
   


}
