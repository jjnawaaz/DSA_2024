package Variables;

class Instance1 {
    public String name;
    public int i;
    public Integer I;

    public Instance1(){
        this.name = "JJ";
    }



    public static void main(String[] args) {
        Instance1 name = new Instance1();

        System.out.println("The name is "+name.name);
        System.out.println("The default value of int i is "+name.i);
        System.out.println("The default value of Integer I is "+name.I);
    }
}
