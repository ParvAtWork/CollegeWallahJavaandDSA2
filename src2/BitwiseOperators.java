//6. Bitwise Operators
//   &   Bitwise AND                   | When: Bit-level AND         | How: a & b
//   |   Bitwise OR                    | When: Bit-level OR          | How: a | b
//   ^   Bitwise XOR                   | When: Bit-level XOR         | How: a ^ b   When same number given 0 as output and when different number give the 1 as the output let see an example and take bits things for 9 and 10 9->1001 and 10->1010 and when we add them the output is 0011.
//   ~   Bitwise Complement[It is also called as the NOT operator]            | When:This operator Flip bits             | How: ~a
//   <<  Left shift                    | When: Multiply by 2^n       | How: a << 2  You can see its explnation from the College wallah Java with DSA playlist.
//   >>  Right shift                   | When: Divide by 2^n         | How: a >> 1
//   >>> Unsigned right shift          | When: Shift with 0 fill     | How: a >>> 1
//Note -> Sometimes we write a<<b for the (a*2^b)
//Note -> Sometimes we write a>>b for the (a/2^b)


import java.util.*;
import java.util.Scanner;
public class BitwiseOperators {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number for a:");
        int a = sc.nextInt();
        System.out.println("Enter the number for b:");
        int b = sc.nextInt();
        System.out.println("The output will be:" +(a&b));
        System.out.println("The output will be:" +(a|b));
        System.out.println("The output will be:" +(a^b));
        System.out.println("The output will be:" +(a<<2));
        System.out.println("The output will be:" +(a>>2));
        sc.close();

    }
}
