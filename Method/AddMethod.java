package Method;

class Add{
    int s = 0;
    public int addTwoInt(int x, int y){
        s = x + y;
        return s;
    }
}


public class AddMethod {
    public static void main(String[] args) {
        Add add = new Add();
        int result = add.addTwoInt(3, 5);
        System.out.println(result);
    }
}
