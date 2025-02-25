package Object;

class Object1 {
    String n;

    public Object1(String n){
        this.n = n;
    }

    @Override
    public String toString(){
        return "Person{name:'" +n+ "'}";
    }

    public static void main(String[] args) {
        Object1 p = new Object1("Hello");
        
        // Custom string representation
        System.out.println(p.toString());

        // Default hash code value
        System.out.println(p.hashCode());
    }
}