package Args;

public class Cmdargs {
    public static void main(String[] args) {
        if(args.length > 0){
            System.out.println("The command line args are: ");

            for(String val: args){
                System.out.print(val+" ");
            }
        }
        else{
            System.out.println("No command line agrs found");
        }
    }
}
