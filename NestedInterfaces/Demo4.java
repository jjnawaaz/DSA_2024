package NestedInterfaces;

interface Parent4{
    protected interface Test4{
        void show();
    }
}


class Child4 implements Parent4.Test4{
    public void show(){
        System.out.println("show method of interface");
    }
}


class Demo4{
    public static void main(String[] args) {
        Parent4.Test4 obj;
        Child4 c = new Child4();
        obj = c;
        obj.show();
    }
}
