import java.util.Arrays;
import java.util.Scanner;
public class UpdatingAnArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] OriginalArray = new int[5];

        System.out.println("Enter any 5 Random Values: ");
        for(int i = 0 ; i < OriginalArray.length ; i++){
            System.out.println("Enter the value for index " + (i+1));
            OriginalArray[i] = sc.nextInt();
        }
        System.out.println("The OriginalArray is: ");
        System.out.println(Arrays.toString(OriginalArray));
        UpdatingPart(OriginalArray);
        sc.close();
    }

    static void UpdatingPart(int[] OriginalArray){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index number for which you want to update the value: " );
        int index = sc.nextInt();
        System.out.println("Enter the value for that index: ");
        int newValue = sc.nextInt();
        OriginalArray[index - 1] = newValue;
        System.out.println("The Updated Array is: ");
        System.out.println(Arrays.toString(OriginalArray));

        sc.close();
    }
}
//Line OriginalArray[index] = newValue; ka matlab hai: array ke given index par jao aur uski purani value ko nayi value se replace kar do.
// OriginalArray[index - 1] = newValue; ya wali line index ko user ko user ka hisab sa work kara thi hai
