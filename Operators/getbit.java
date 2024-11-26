/*  GET BIT


 * Find the digit using Bit operators 
 * eg 0110 find the number in 3rd pos here 3 pos is 0,1,2 from right that is 1
 * to do that we have to follow this logic 
 * first we make a bitmask which is 1<<pos hre pos is 1,2,3 or whatever
 * then we perform bitwise AND 
 * We ll get if we get 1 or 0 then and we can find from there
 * eg 1010 and pos 3
 * first we create bitmask 1<<3 which is 0001 shifted 3 digits to right which makes it 1000
 * Now we perform AND
 * 1 0 0 0
 * 1 0 1 0
 * -------
 * 1 0 0 0 which is a non zero value so the ans is 1 which is true 1010 3rd pos value is 1 
 * we check if we got non zero value or zero value i.e either 0000 or any value with 1 in it 
 * If we get 1 then the ans is 1 if we get zero value then the ans is 0 
 */

package Operators;

public class getbit {
    public static void main(String[] args) {
       int n = 5;
       int pos = 1;
       int bitmask = 1 << pos;
    
    // performing bitwise AND 
       if((bitmask & n) == 0){
        System.out.println("The value of digit is 0");
    } else {
        System.out.println("The value of digit is 1");
    }
    }
}
