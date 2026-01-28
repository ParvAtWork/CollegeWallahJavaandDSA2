import java.util.*;
import java.util.Scanner;
public class CountTheNumberOfDigitForTheGivenNumberN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        int digitCount = 0;
        while(num>0){
            num = num/10;
            digitCount++;
//            System.out.println(digitCount); //Har iteration pa number print kara count kar na ka liya
        }
        System.out.println(digitCount);//or ya while loop khatam ka baad number print kara gha sidha.
    }

}
