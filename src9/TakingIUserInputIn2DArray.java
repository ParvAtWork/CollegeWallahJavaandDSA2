import java.util.Scanner;
import java.util.Arrays;
public class TakingIUserInputIn2DArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 2D Array Matrice");
        int[][] arr = new int[3][3];
        for(int i = 0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                arr[i][j] = sc.nextInt();
//                System.out.println(Arrays.deepToString(arr));
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

            }


            sc.close();
        }
//

    }

