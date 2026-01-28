
import java.util.Scanner;
import java.util.Arrays;
public class PrintingArrayInsteadUsingForLoopUsingArrayClasses {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Array");
        int[] arr = new int[5];
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr)); //toString is an array class.
    }
}
