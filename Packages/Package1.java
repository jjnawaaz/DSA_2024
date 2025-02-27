// Using Ud1 class from Userdefined Package

package Packages;
import Packages.Userdefined.Ud1;

public class Package1 {
    public static void main(String[] args) {
        String s = "Hi there using one package and printing using another package";

        Ud1 o = new Ud1();
        o.getNames(s);
    }
}
