import java.util.*;
import java.util.Scanner;
public class EvenAsWellAsDivisibleBy3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int number = sc.nextInt();
        String rule = ( number % 2 == 0 && number % 3 == 0) ? "It is following the Rule" : "It is not following the Rule";
        System.out.println(rule);
    }
}
