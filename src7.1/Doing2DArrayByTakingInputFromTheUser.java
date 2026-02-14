import java.util.Scanner;
public class Doing2DArrayByTakingInputFromTheUser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of cols");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the values for 2D Array");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                System.out.println("Element at [" + i + "] [" + j + "] is: ");
                        matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("2D Array element are");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
