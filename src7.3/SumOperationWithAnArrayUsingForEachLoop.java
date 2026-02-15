import java.util.Arrays;
import java.util.Scanner;
public class SumOperationWithAnArrayUsingForEachLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] OriginalArray = new int[5];
        System.out.println("Enter any 5 random values for Original Array: ");
        for (int i = 0; i < OriginalArray.length; i++) {
            System.out.println("Enter the value for index  " + (i + 1));
            OriginalArray[i] = sc.nextInt();
        }
        System.out.println("The Original Array In a Line is: ");
        System.out.println(Arrays.toString(OriginalArray));

        AdditionPart(OriginalArray);
    }

    static void AdditionPart(int[] OriginalArray) {
        int sum = 0;
        for (int val : OriginalArray) {
            sum = sum + val;
        }
        System.out.println("The Sum of an array is: ");
        System.out.println(sum);
    }
}

//Dry Run
//i=0 → sum = 0 + OriginalArray[0] = 0 + 10 = 10
//
//i=1 → sum = 10 + OriginalArray[1] = 10 + 20 = 30
//
//i=2 → sum = 30 + OriginalArray[2] = 30 + 30 = 60