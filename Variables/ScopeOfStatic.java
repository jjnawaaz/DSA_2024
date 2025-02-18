package Variables;



class Test{
    static int i = 10;     // Can be accessed anywhere
}

class Test2{
    static int i = 20;         
}


class ScopeOfStatic {
    public static void main(String[] args) {
        System.out.println("Static Variable "+Test2.i);       //Should specify the class name from whic it is accessed 
    }
}
