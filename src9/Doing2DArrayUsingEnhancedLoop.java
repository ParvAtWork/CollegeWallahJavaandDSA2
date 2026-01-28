import java.util.Scanner;
import java.util.Arrays;
public class Doing2DArrayUsingEnhancedLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array");
        int[][] arr = new int[3][3];
        for(int row = 0 ; row < arr.length;row++){
            for(int col = 0 ;col < arr[row].length;col++){
                arr[row][col] =sc.nextInt();
            }
        }
            for(int[] arr2 : arr){ //here datatype is an array itself only in this enhanced for loop.
                System.out.println(Arrays.toString(arr2));
        }
    sc.close();
    }
}
/*
[I@145eaa29] ka matlab
[I → ye batata hai ki ye ek array of integers hai.

@145eaa29 → ye us array ka hashcode/memory reference hai.

Matlab Java tumhe actual values nahi dikhata, sirf reference dikhata hai.
*/
