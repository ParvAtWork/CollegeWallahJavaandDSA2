//2. if-else Statement
//        -> Agar condition true hai to 'if' block chalega,
//        warna 'else' block chalega.
//        Example:
//        if (a % 2 == 0) {
//        System.out.println("Even");
//        } else {
//        System.out.println("Odd");
//        }


import java.util.*;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        long very = sc.nextLong();
        if (very % 2 != 0) {
            System.out.println("The value is odd which is " + very);
        }
        else{
            System.out.println("The value is even which is " + very);
        }
    }
}
