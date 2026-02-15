import java.util.*;
public class StoringValuesInArrayByUsingScanner{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] storedArrayValues = new int[5];

        System.out.println("Enter the Any 5 random values to form an array:");
        for(int i = 0 ; i < storedArrayValues.length ; i++){
            System.out.println("The value you store for index: " + (i+1) + " is: ");
            storedArrayValues[i] = sc.nextInt();
        }
        System.out.println("The Array Elements are: ");
        System.out.println(Arrays.toString(storedArrayValues));
        sc.close();

    }
}
//Jab tumne i+1 bina brackets ke likha tha, output 01, 11, 21 aisa aa raha tha. Ye Java ka string concatenation rule ki wajah se hota hai.
//Java left‑to‑right evaluate karta hai.
//
//        "Index: " + i → ye ek string ban jaata hai (e.g. "Index: 0").
//
//Uske baad + 1 bhi string ke saath concatenate ho jaata hai, maths nahi hoti.
//
//Result: "Index: 0" + 1 → "Index: 01"
//
//        "Index: 1" + 1 → "Index: 11"
//
//        "Index: 2" + 1 → "Index: 21"
