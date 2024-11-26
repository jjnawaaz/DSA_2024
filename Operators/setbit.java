/*  SET BIT


 * Set the digit using Bit operators 
 * eg 0110 set the number in 3rd pos here 3 pos is 0,1,2 from right that is 1
 * to do that we have to follow this logic 
 * first we make a bitmask which is 1<<pos hre pos is 1,2,3 or whatever
 * then we perform bitwise OR
 * eg 1010 and pos 2
 * first we create bitmask 1<<2 which is 0001 shifted 3 digits to right which makes it 0100
 * Now we perform OR
 * 0 1 0 0
 * 1 0 1 0
 * -------
 * 1 1 1 0 which adds 1 to the bit at the desired pos
 * 
 */


package Operators;

public class setbit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;

        int setValue = bitmask | n;
        System.out.println(setValue);
    }
}
