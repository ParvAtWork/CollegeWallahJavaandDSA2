/*
===========================================
🔹 Function Parameters in Java
===========================================

💡 Syntax:
returnType functionName(dataType parameterName) {
    // function body
}

Example:
static void change(int[] arr) {
    arr[0] = 99;
}

-------------------------------------------
🔹 Can we use any name for parameter?
-------------------------------------------
✅ YES — You can use **any valid variable name** for the parameter.

Example:
static void change(int[] nums) { ... }
static void change(int[] data) { ... }
static void change(int[] x)    { ... }

All are valid. The name is just a **local identifier** used inside the function.

⚠️ But:
- The **data type must match** the type of argument passed.
- The **name should be meaningful** for readability and maintainability.

-------------------------------------------
🔹 What matters more?
-------------------------------------------
✔ Data type → must match the type of argument passed
✔ Variable name → can be anything, but should be descriptive

Example:
int[] numbers = {1, 2, 3};
change(numbers); // calls function with int[] argument

Function definition:
static void change(int[] anything) {
    anything[0] = 99;
}

Here, `anything` is just a name. You could use `arr`, `nums`, `data`, etc.

-------------------------------------------
🔹 IntelliJ Tip:
- IntelliJ will auto-suggest meaningful names based on context.
- You can rename parameter anytime using Refactor → Rename.

===========================================
End of Notes ✅
===========================================
*/

//My Codes Starts from Done below.

//Giving input in the code only
//import java.util.Scanner;
//import java.util.Arrays;
//public class ChangingStringUsingFunctionMethod {
//    public static void main(String[] args){
//        int[] nums = {3,5,7,9};
//        System.out.println(Arrays.toString(nums));
//        Change(nums);
//        System.out.println(Arrays.toString(nums));
//    }
//    static void Change(int[] arr){
//        arr[0] = 4;
//    }
//}

//Here taking input from the user
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class ChangingStringUsingFunctionMethod{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Array");
        int[] arra = new int[4];
        for(int i=0 ; i<arra.length ; i++){
            arra[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arra));
        Change(arra);
        System.out.println(Arrays.toString(arra));
    }
    //Here below we have written the array function.
    static void Change(int[] arr){
        arr[1] = 3;
    }

}

/* Note -> Arrays are mutable(which can be changed) in java.
Q.static void Change(int[] arr) mein arr kya hai?
1.int[] arr ka matlab hai ki ye function ek parameter accept karega jo ek integer array hoga.
2.Yaha arr ek naam (identifier) hai jo tumne diya hai. Jab tum Change(arra); call karte ho, tumhara arra array function ke andar arr ke naam se accessible ho jaata hai.
3.Matlab: arr ek reference variable hai jo us array ko point karta hai jo tumne main function mein banaya tha.
*/
