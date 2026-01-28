//6. Ternary Operator (?:)
//   -> Short form of if-else.
//Example:
//int max = (a > b) ? a : b;
import java.util.*;
import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Age");
        int age = sc.nextInt();
        String category = (age > 18) ? "Your are eligible for voting" : "You are not eligible for voting";
        System.out.println(category);
        sc.close();
    }


}
