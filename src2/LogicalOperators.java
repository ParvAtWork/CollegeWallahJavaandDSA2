//5. Logical Operators
//   &&  Logical AND                   | When: Both conditions true  | How: if(a>0 && b>0)
//   ||  Logical OR                    | When: At least one true     | How: if(a>0 || b>0)
//   !   Logical NOT                   | When: Invert condition      | How: if(!flag)

import java.util.*;
import java.util.Scanner;
public class LogicalOperators {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for a");
        int a = sc.nextInt();
        System.out.println("Enter the number for the b");
        int b = sc.nextInt();
        System.out.println("Your Output is " + (a>0 && b>0));
        System.out.println("Your Output is " + (a>0 || a<b));
        System.out.println("Your Output is " + !(a>b));

    }
}
