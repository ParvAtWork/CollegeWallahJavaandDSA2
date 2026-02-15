import java.util.Scanner;
import java.util.Arrays;
public class FindingMaxAndMinInAnArrayUsingForEachLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] OriginalArray = new int[5];
        System.out.println("Enter any 5 random values for an Array: ");
        for(int i = 0 ; i < OriginalArray.length ; i++){
            System.out.println("Enter the value for index " + (i+1));
            OriginalArray[i] = sc.nextInt();
        }
        System.out.println("The Original Array in line is: ");
        System.out.println(Arrays.toString(OriginalArray));
        MaxAndMin(OriginalArray);
        sc.close();
    }

    static void MaxAndMin(int[] OriginalArray){
        int MaxValue = OriginalArray[0];
        int MinValue = OriginalArray[0];
        for(int FindingVal : OriginalArray){
            if(FindingVal > MaxValue) MaxValue = FindingVal;
            if(FindingVal < MinValue) MinValue = FindingVal;
        }
        System.out.println("The Max Value in an Original Array is: " + MaxValue);
        System.out.println("The Min Value in an Original Array is: " + MinValue);


    }

}
