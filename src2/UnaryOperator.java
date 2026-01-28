//2. Unary Operators
//   +   Positive sign                 | When: Explicit positive     | How: +x;
//   -   Negative sign                 | When: Negate value          | How: -x;
//   ++  Increment (pre/post)          | When: Increase by 1         | How: ++x / x++;
//   --  Decrement (pre/post)          | When: Decrease by 1         | How: --x / x--;
//   !   Logical NOT                   | When: Invert boolean        | How: !flag;

import java.util.*;
import java.util.Scanner;

public class UnaryOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for a:"); //2
        int a = sc.nextInt();
        System.out.println("Enter the number for b:"); //2
        int b = sc.nextInt();

        System.out.println(a++);
        System.out.println(a);

        System.out.println(++b);
        System.out.println(b);

        int x = a++;
        int y = ++b;

        System.out.println(x);
        System.out.println(y);

        System.out.println(a);
        System.out.println(b);

        sc.close();
    }
}
