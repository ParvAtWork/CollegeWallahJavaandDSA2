import java.util.*;
import java.util.Scanner;
public class DivisibleBy3Or5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        if( number % 3 == 0 || number % 5 == 0) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("It is divisible by both 3 and 5");
            } else if (number % 3 == 0) {
                System.out.println("It is divisible to 3");
            } else if (number % 5 == 0) {
                System.out.println("It is divisible by 5");
            }
        }else{
                System.out.println("The number is not divisible by another of the condition given. ");
            }
        sc.close();
        }

    }

