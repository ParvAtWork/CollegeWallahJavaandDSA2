//2. if-else Statement
//        -> Agar condition true hai to 'if' block chalega,
//        warna 'else' block chalega.
//        Example:
//        if (a % 2 == 0) {
//        System.out.println("Even");
//        } else {
//        System.out.println("Odd");
//        }
//Note-:else bina condition ka likha jata hai.
//Note-:else if condition ka sath likha jata hai.
import java.util.*;
import java.util.Scanner;
public class IfElseIfLadder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age");
        int age = sc.nextInt();
        if(age < 12){
            System.out.println("You are Child because your age is " + age);
        } else if (age > 12 && age < 18) {
            System.out.println("You are Teenager because your age is " + age);
        } else if (age >= 18) {
            System.out.println("You are Adult because your age is above " + age);
        }
    }
}
