package Method;

public class Method3 {
    private int num;
    private String n;

    //Accessor (getter) methods
    public int getNumber(){
        return num;
    }

    public String getName(){
        return n;
    } 

    public void setNumber(int n){
        this.num = n;
    }

    public void setName(String n){
        this.n = n;
    }


    public void printDetails(){
        System.out.println("Number: "+num);
        System.out.println("Name: "+n);
    }


    public static void main(String[] args) {
        Method3 g = new Method3();
        g.setNumber(1243);
        g.setName("String");
        g.printDetails();
    }
}
