package Variables;

public class ScopeOfInstance {
    int a = 10;
    private String name;

    public ScopeOfInstance(){
        this.name="Junaid";
    }
    public static void main(String args[]){
       ScopeOfInstance name = new ScopeOfInstance();
       System.out.println("Name is "+name.name);
    }

}




