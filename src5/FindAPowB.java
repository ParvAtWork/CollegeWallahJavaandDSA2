import java.util.*;
import java.util.Scanner;
public class FindAPowB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number a");
        int num_a = sc.nextInt();
        System.out.println("Enter the number b");
        int num_b = sc.nextInt();
        int ans = 1;
        for (int i = 1 ; i <= num_b  ; i++){
            ans *= num_a;
        }
        System.out.println(ans);
        sc.close();
    }
}
