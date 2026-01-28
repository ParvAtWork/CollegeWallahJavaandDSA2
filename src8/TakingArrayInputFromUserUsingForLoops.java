import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class TakingArrayInputFromUserUsingForLoops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array");
        int[] arr = new int[5];
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
    }
}
