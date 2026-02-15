import java.util.Arrays;
import java.util.Scanner;

public class CopyingAnArrayUsingForLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] originalArray = new int[5];

        System.out.println("Enter any 5 value for the Array: ");
        for(int i = 0 ; i < originalArray.length ; i++){
            System.out.println("Value at Index: " + (i+1));
            originalArray[i] = sc.nextInt();  // Here taking the value from sc.nextInt and storing it in the originalArray[i] here i is for store value at the each iteration of for loop index.
        }
        System.out.println("The OriginalArray in Line is: ");
        System.out.println(Arrays.toString(originalArray));
        CopyingPart(originalArray);
        sc.close();

    }

    static void CopyingPart(int[] originalArray){   //
        int[] copiedArr = new int[originalArray.length];
        for(int i = 0 ; i < originalArray.length ; i++){
            copiedArr[i] = originalArray[i];
        }
        System.out.println("The copied Array is: ");
        System.out.println(Arrays.toString(copiedArr));
    }


}

// =======================================
// Topic: Why Pass Array as Parameter
// Format: IntelliJ-Friendly Notes
// =======================================

        /*
         * ---------------------------------------
         * Reason for Passing Array as Parameter
         * ---------------------------------------
         * - originalArray ek local variable hai jo
         *   sirf main() ke andar accessible hai.
         * - Dusre method (CopyingPart) ke andar
         *   directly use nahi kar sakte.
         * - Isliye humein array ko parameter ke
         *   roop mein pass karna padta hai.
         *
         * ---------------------------------------
         * Need for int[] in Method Signature
         * ---------------------------------------
         * - Java mein har parameter ka type declare
         *   karna mandatory hai.
         * - originalArray ek integer array hai,
         *   toh uska type int[] likhna hoga.
         * - Agar type declare nahi karoge toh
         *   compiler ko samajh nahi aayega ki
         *   method kis type ka data expect kar raha hai.
         *
         * ---------------------------------------
         * Example
         * ---------------------------------------
         * static void CopyingPart(int[] originalArray) {
         *     int[] copiedArr = new int[originalArray.length];
         *     for (int i = 0; i < originalArray.length; i++) {
         *         copiedArr[i] = originalArray[i];
         *     }
         *     System.out.println(Arrays.toString(copiedArr));
         * }
         *
         * ---------------------------------------
         * Hinglish Summary
         * ---------------------------------------
         * - Array ko dusre method mein use karna hai
         *   toh parameter ke roop mein pass karna zaruri hai.
         * - int[] likhna padta hai taaki Java ko pata ho
         *   ki method ek integer array expect kar raha hai.
         */





