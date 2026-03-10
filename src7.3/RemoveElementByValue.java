import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementByValue {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array you want: ");
        int size = sc.nextInt();
        int[] OriginalArray = new int[size];

        for(int i = 0 ; i < size ; i++){
            System.out.println("Enter the element for the index " + (i+1));
            OriginalArray[i] = sc.nextInt();
        }
        System.out.println("The Original Array is:");
        System.out.println(Arrays.toString(OriginalArray));

        System.out.println("Enter the element which you want to remove from the Array:");
        int removeElement  = sc .nextInt();

        int[] newArray = removingPart(OriginalArray , removeElement);

        System.out.println("The New Array is: ");
        System.out.println(Arrays.toString(newArray));

    }

    static int[] removingPart(int[] arr , int removingElement ) {
        int intToRemove = -1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == removingElement){
               intToRemove = i;
               break;
            }
        }
        if(intToRemove == -1){
            System.out.println("Element not found in an Array: ");
            return arr;
        }
        int[] newArr = new int[arr.length -1];

        for(int i =0  , j = 0 ; i < arr.length ; i++){
            if(arr[i] != removingElement){
                newArr[j++] = arr[i];
            }

        }
        return newArr;

    }
}






//
//🔹 Step by Step Samajh
//i → loop ka current index hai jo original array traverse kar raha hai.
//
//indexToRemove → wo index hai jaha element mila tha jo remove karna hai.
//
//!= → "not equal to" operator hai. Matlab condition tabhi true hogi jab i aur indexToRemove alag hon.
//
//🔹 Iska kaam
//Jab loop chal raha hai, har element check hota hai.
//
//Agar current index (i) remove wala index ke barabar hai → condition false ho jaayegi → element skip ho jaayega.
//
//Agar current index remove wala nahi hai → condition true hogi → element copy ho jaayega new array mein.
//
//        🔹 Example
//Original array: [10, 20, 30, 40]
//Remove element: 30 → indexToRemove = 2
//
//Loop:
//
//i=0 → 0 != 2 ✔ → copy 10
//
//i=1 → 1 != 2 ✔ → copy 20
//
//i=2 → 2 != 2 ✘ → skip (30 remove ho gaya)
//
//i=3 → 3 != 2 ✔ → copy 40
//
//Result: newArr = [10, 20, 40]
//
//        🔹 Hinglish Recap
//Ye line ka kaam hai:
//
//Check karna ki current index remove wala index nahi hai.
//
//Agar nahi hai → element copy karo.
//
//Agar hai → skip kar do.
//
//        👉 Matlab: if (i != indexToRemove) ek filter ki tarah kaam karta hai jo ensure karta hai ki remove wala element new array mein copy na ho.

//
//🔹 Kaise skip hota hai bina continue ke
//Yaha skip karne ka logic condition ke andar hi likha hai.
//
//Jab i == indexToRemove hota hai, condition i != indexToRemove false ho jaati hai.
//
//        Matlab: if block ke andar ka code execute hi nahi hota.
//
//Is wajah se wo element new array mein copy nahi hota → effectively skip ho gaya.
//
//        👉 continue likhne ki zarurat hi nahi hai, kyunki condition false hone par Java automatically us block ko ignore kar deta hai aur loop agle iteration par chala jaata hai.