import java.util.Scanner;
import java.util.Arrays;
public class FindingMaxAndMinInAnArrayUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] OriginalArray = new int[5];

        System.out.println("Enter any 5 random value for the Array: ");
        for (int i = 0; i < OriginalArray.length; i++) {
            System.out.println("Enter the value for the index " + (i + 1));
            OriginalArray[i] = sc.nextInt();
        }
        System.out.println("The Original Array in the Line is: ");
        System.out.println(Arrays.toString(OriginalArray));
        FindingMaxAndMinUsingForLoop(OriginalArray);
    }

    static void FindingMaxAndMinUsingForLoop(int[] OriginalArray) {
        int maxValue = OriginalArray[0];
        int minValue = OriginalArray[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < OriginalArray.length; i++) {
            if (OriginalArray[i] > maxValue) {
                maxValue = OriginalArray[i];
                maxIndex = (i+1);
            }
        }
        for (int i = 0; i < OriginalArray.length; i++) {
            if (OriginalArray[i] < minValue) {
                minValue = OriginalArray[i];
                minIndex = (i+1);
            }
        }
        System.out.println("The Max Value in an Original Array is: " + maxValue + " And Its Index is: " + maxIndex);
        System.out.println("The Min Value in an Original Array is: " + minValue + " And Its Index is: " + minIndex);

    }
}
