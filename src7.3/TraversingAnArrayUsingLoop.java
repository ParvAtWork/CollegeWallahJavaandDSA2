
import java.util.Arrays;
import java.util.Scanner;

public class TraversingAnArrayUsingLoop {
    public static void main(String[] args) {
        TraversingPart();
    }

    static void TraversingPart() {
        Scanner sc = new Scanner(System.in);
        int[] StoredArrayValues = new int[5];
        System.out.println("Enter any 5 Random Values: ");
        for (int i = 0; i < StoredArrayValues.length; i++) {
            System.out.println("Enter the value for index " + (i + 1));
            StoredArrayValues[i] = sc.nextInt();
        }
        System.out.println("Array in a Line: " + Arrays.toString(StoredArrayValues));

        System.out.println("Here Traversing an Array: ");
        for (int i=0 ; i < StoredArrayValues.length ; i++){
            System.out.println("Index " + (i+1) + " value is: " + StoredArrayValues[i] );
        }
        sc.close();
    }
}

/*
 * Array traversal = "Array ke har element par ek‑ek karke jaana"
 *
 * Matlab:
 * Pehle index 0 par jao,
 * phir index 1,
 * phir index 2 …
 * aur last tak jao.
 */


// =======================================
// Topic: Array Operations (Notes)
// Format: IntelliJ-Friendly Java Notes
// =======================================


        /*
         * ---------------------------------------
         * 4. Copying an Array
         * ---------------------------------------
         * - Ek naya array banao same length ka.
         * - Har element ko ek-ek karke copy karo.
         * Example:
         * int[] copyArr = new int[arr.length];
         * for (int i = 0; i < arr.length; i++) {
         *     copyArr[i] = arr[i];
         * }
         * Output: Copied array print hoga.
         */

        /*
         * ---------------------------------------
         * 5. Updating Values in an Array
         * ---------------------------------------
         * - Kisi specific index par nayi value assign karo.
         * Example:
         * arr[2] = 99; // replace 30 with 99
         * Output: Updated array print hoga.
         */

        /*
         * ---------------------------------------
         * 6. Searching in an Array
         * ---------------------------------------
         * - Loop se har element check karo.
         * - Agar element milta hai toh index print karo.
         * - Agar nahi milta toh "not found" print karo.
         * Example:
         * int searchKey = 40;
         * boolean found = false;
         * for (int i = 0; i < arr.length; i++) {
         *     if (arr[i] == searchKey) {
         *         System.out.println("Element found at index " + i);
         *         found = true;
         *         break;
         *     }
         * }
         * if (!found) System.out.println("Element not found.");
         */

        /*
         * ---------------------------------------
         * 7. Finding Sum of Elements
         * ---------------------------------------
         * - Ek variable sum banao.
         * - Har element ko sum mein add karo.
         * Example:
         * int sum = 0;
         * for (int val : arr) {
         *     sum += val;
         * }
         * Output: Sum of elements print hoga.
         */

        /*
         * ---------------------------------------
         * 8. Finding Max and Min
         * ---------------------------------------
         * - Max aur Min ko pehle element se initialize karo.
         * - Loop se har element compare karo.
         * - Agar element bada hai toh max update karo.
         * - Agar element chhota hai toh min update karo.
         * Example:
         * int max = arr[0];
         * int min = arr[0];
         * for (int val : arr) {
         *     if (val > max) max = val;
         *     if (val < min) min = val;
         * }
         * Output: Max aur Min print honge.
         */


