package Encapsulation;

class Area{
    private int length;
    private int breadth;

    Area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea(){
        int area = length * breadth;
        System.out.println("The area is : "+ area );
    }
}



public class Encapsulation3 {
    public static void main(String[] args) {
        Area rect = new Area(2, 4);
        rect.getArea();
    }
}
