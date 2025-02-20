package Arrays;


class Students{
    public String name;
    Students(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}



public class ArrayObjects2 {
    public static void main(String[] args) {
        Students[] myStudents = new Students[]{
            new Students("Hello"),
            new Students("Hi there 2"),
            new Students("Hi there 3"),
            new Students("Hi there 4")
        };

        
        for(Students i : myStudents){
            System.out.println(i);
        }


        for(int i = 0; i < myStudents.length; i++){
            System.out.println(myStudents[i]);
        }
    }
}
