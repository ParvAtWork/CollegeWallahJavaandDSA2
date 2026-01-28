//3. Assignment Operators
//        =   Assign value                  | When: Initialize/update var | How: x = 10;
//        +=  Add and assign                | When: Add & store result    | How: x += 5;  | a = a + 5;
//        -=  Subtract and assign           | When: Subtract & store      | How: x -= 3;  | a = a - 3;
//        *=  Multiply and assign           | When: Multiply & store      | How: x *= 2;  | a = a * 2;
//        /=  Divide and assign             | When: Divide & store        | How: x /= 4;  | a = a / 4;
//        %=  Modulus and assign            | When: Remainder & store     | How: x %= 2;  | a = a % 2;

import java.sql.SQLOutput;
import java.util.*;
import java.util.Scanner;
public class AssigmentOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for a"); //3
        int a = sc.nextInt();
        System.out.println("Enter the number for b"); //2
        int b = sc.nextInt();
        System.out.println("The result is:" + (a+=b));
        System.out.println("The result is:" + (a-=b));
        System.out.println("The result is:" + (a*=b));
        System.out.println("The result is:" + (a/=b));
        System.out.println("The result is:" + (a%=b));
        System.out.println("The result is:" + (a=b)); // iska matlab hai b ki value (2) ko a mein copy kar do.

        sc.close();
    }
}