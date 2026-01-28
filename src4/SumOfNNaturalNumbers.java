import java.util.*;
import java.util.Scanner;
public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Natural Number");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= n) {
            sum = sum + i;
            i++;           //If harr iteration ka baad print ki value chaiya tho print andar karo sum ko
        }
        System.out.println(sum); //If sidha sum ki direct value chaiya tho print loop ka bahar likho.
        sc.close();

    }
}
