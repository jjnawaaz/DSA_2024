package Args;

public class IntegerArgs {
    public static void Nums(int...n){
        for(int i : n){
            System.out.print(i+" ");
        }
    }


    public static void main(String[] args) {
        Nums(1,2,3,4,5,6);
        Nums( 1 ,   2, 3,    4);
    }
}
