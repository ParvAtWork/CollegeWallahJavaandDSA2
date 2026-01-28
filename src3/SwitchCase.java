//5. switch Statement
//   -> Multiple values ke liye ek hi variable check karna.
//        Example:
//        switch (day) {
//        case 1: System.out.println("Monday"); break;
//        case 2: System.out.println("Tuesday"); break;
//        case 3: System.out.println("Wednesday"); break;
//default: System.out.println("Invalid day");
//   }
//Note-: It is the alternate way to write the if else statements.
import java.util.*;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day Number");
        int day= sc.nextInt();
        switch (day){   //yah pa jo switch ka () ka andar raha gha vo object hogha
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("You entered the wrong day");
        }
        sc.close();
    }
}


