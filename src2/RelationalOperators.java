//4. Relational Operators (Ya comparison ka results ko evaluate karna mein use hota hai.)
//   ==       Equal to                      | When: Compare equality      | How: if(a == b)
//   !=       Not equal to                  | When: Compare inequality    | How: if(a != b)
//   >        Greater than                  | When: Check larger value    | How: if(a > b)
//   <        Less than                     | When: Check smaller value   | How: if(a < b)
//   >=       Greater or equal              | When: Larger or equal check | How: if(a >= b)
//   <=       Less or equal                 | When: Smaller or equal check| How: if(a <= b)

import java.util.*;
import java.util.Scanner;
public class RelationalOperators {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number for the a");
        int a = sc.nextInt();
        System.out.println("Enter the number for the b");
        int b = sc.nextInt();
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);



    }
}
