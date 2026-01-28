import java.util.Scanner;
import java.util.Arrays;
public class Printing2DArrayByUsingToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array");
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println(Arrays.toString(arr[i]));
            }
            sc.close();
        }
    }


