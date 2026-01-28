//4. Nested if
//        -> Ek if ke andar dusra if likh sakte ho.
//        Example:
//        if (age >= 18) {
//        if (citizen == true) {
//        System.out.println("Eligible to vote");
//       }
//     }

import java.util.*;
import java.util.Scanner;
public class NestedIfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = sc.nextInt();
        if(age > 18){
            if(age < 18){
                System.out.println("You are uneligible to vote");
            }else {
                System.out.println("You are eligible to vote");
            }
        }
        sc.close();
    }
}
