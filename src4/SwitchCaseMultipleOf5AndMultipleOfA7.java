//5. Break and Continue
//       -> break → loop terminate karta hai.
//        -> continue → current iteration skip karta hai.
//
//        Example:
//        for(int i = 1; i <= 5; i++) {
//        if(i == 3) continue; // skip 3
//        if(i == 4) break;    // stop at 4
//        System.out.println("i = " + i);
//       }
import java.util.Scanner;
public class SwitchCaseMultipleOf5AndMultipleOfA7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        while(true){
        if(num % 5 == 0 && num % 7 == 0) {
            System.out.println("Answers Found " + num);
            break;
        }
            System.out.println("It is not the right value for the condition.");
            break;

        }

    }
}
