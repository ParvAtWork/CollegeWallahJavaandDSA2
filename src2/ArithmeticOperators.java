//1. Arithmetic Operators
//        +  Addition        → a + b        | When: Basic math operations | How: int sum = a + b;
//        -  Subtraction     → a - b        | When: Difference of values  | How: int diff = a - b;
//        *  Multiplication  → a * b        | When: Product calculation   | How: int prod = a * b;
//        /  Division        → a / b        | When: Quotient (int division)| How: int div = a / b;
//        %  Modulus         → a % b        | When: Remainder needed      | How: int rem = a % b;


import java.util.*;
import java.util.Scanner;
public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number for p");
        int p = sc.nextInt();
        System.out.println("Enter your number for q");
        int q = sc.nextInt();
        System.out.println("The sum of p and q is = " + (p + q));
        System.out.println(p - q);
        System.out.println(p * q);
        System.out.println(p / q);
        System.out.println(p % q);
    }
}
