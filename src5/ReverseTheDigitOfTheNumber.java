import java.util.*;
import java.util.Scanner;
public class ReverseTheDigitOfTheNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        int reversed = 0;
        int duplicate_num = num;
        while(num>0){
            int rem = num % 10;
            reversed = reversed * 10 + rem;
            num = num / 10;
        }
        System.out.println("The reversed number for the given input " + duplicate_num + " is " +  reversed);
        sc.close();
    }


}
