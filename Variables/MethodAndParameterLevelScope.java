package Variables;

public class MethodAndParameterLevelScope {
    
    static int x = 10;

    private int y = 22;

    public void testFunc(int a){
        MethodAndParameterLevelScope t = new MethodAndParameterLevelScope();
        this.x = a;
        y = 50;

        System.out.println("New X is "+MethodAndParameterLevelScope.x);
        System.out.println("t.x:"+t.x);
        System.out.println("t.y:"+t.y);
        System.out.println("y:"+y);
    }


    public static void main(String args[]){
        MethodAndParameterLevelScope a = new MethodAndParameterLevelScope();
        a.testFunc(6);
    }
}
