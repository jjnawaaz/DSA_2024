// Using user defined package classes Ud2 and Ud3

package Packages;

import Packages.Userdefined.Ud2;
import Packages.Userdefined.Ud3;

public class Package3 {
    public static void main(String[] args) {
        Ud2 n1 = new Ud2();
        Ud3 n2 = new Ud3();
        n1.methodClassOne();
        n2.methodClassTwo();
    }
}
