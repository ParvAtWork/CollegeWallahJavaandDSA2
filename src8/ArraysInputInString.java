import java.util.Scanner;
import java.util.Arrays;
public class ArraysInputInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String Array");
        String[] arr = new String[5];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = sc.next(); //here taking input inside the array.
        }
        System.out.print(Arrays.toString(arr));
        sc.close();
    }
}
/* Arrays Imp Notes:
1.Jab tum directly System.out.println(array) karte ho, to wo array ka memory address print karta hai (jaise [I@15db9742), jo samajhna mushkil hota hai.
2.Arrays.toString() use karne se array ke elements ek readable string format mein print hote hain.
3.Ya(Arrays.toString(refernce name of array objcet)) Primitive arrays (int[], double[]) aur object arrays (String[]) dono ke liye kaam karta hai.
*/