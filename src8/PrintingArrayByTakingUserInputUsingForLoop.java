import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class PrintingArrayByTakingUserInputUsingForLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Array");
        int[] arr = new int[10];
        for(int i=0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt(); //Taking input of an array.
        }
        for(int i=0 ; i< arr.length ; i++) {
//           System.out.println("So the array is: " + arr[i]);
//            System.out.print("So the array is:");
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }
}
