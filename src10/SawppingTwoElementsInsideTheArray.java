import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class SawppingTwoElementsInsideTheArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        swap(arr , 2 , 1);
        System.out.println(Arrays.toString(arr));
    }
    //Making Separate function for swapping
    public static void swap(int[] arr , int index1 , int index2){       //arr → ek int[] (array of integers) hai
        int temp = arr[index1];   //Here datatype of the arr is int[] which means it is an array and datatype for both indexes is int.
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
