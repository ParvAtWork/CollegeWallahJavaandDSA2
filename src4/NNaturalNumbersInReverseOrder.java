import java.util.*;
import java.util.Scanner;
public class NNaturalNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural number");
        int nat = sc.nextInt();
        for (int i = nat; i >= 1; i--) { //i--because reverse mein string ja rahi hai.
            System.out.println(i);
        }
        sc.close();
    }
}

