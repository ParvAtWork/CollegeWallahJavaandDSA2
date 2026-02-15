import java.util.Arrays;
import java.util.Scanner;
public class SumOperationWithAnArrayUsingForLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] OriginalArray = new int[5];
        System.out.println("Enter the any 5 random values for the Array: ");
        for(int i = 0 ; i < OriginalArray.length ; i++){
            System.out.println("Enter the value for the index " + (i+1));
            OriginalArray[i] = sc.nextInt();
        }
        System.out.println("The Original Array in line is: ");
        System.out.println(Arrays.toString(OriginalArray));
        SearchingPart(OriginalArray);
    }

    static void SearchingPart(int[] OriginalArray){
        int sum = 0;
        for(int i = 0 ; i < OriginalArray.length ; i++){
            sum = sum + OriginalArray[i];
        }
        System.out.println("The sum of an Array is: ");
        System.out.println(sum);

    }

}
