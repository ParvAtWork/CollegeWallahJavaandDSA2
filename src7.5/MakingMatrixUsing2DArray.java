import java.util.Scanner;

public class MakingMatrixUsing2DArray {
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of row: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of column: ");
        int column = sc.nextInt();

        int[] matrix = inputMatrix(sc , row , column);

        System.out.println("Matrix type Output: ");
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                System.out.print(matrix[i*column+j] + " ");
            }
            System.out.println();
        }
        sc.close();


    }

    static int[] inputMatrix(Scanner sc , int row , int column){
        int[] flatArray = new int[row*column];
        System.out.println("Enter the elements of the matrix: ");
        for(int i =0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                flatArray[i * column + j] = sc.nextInt();
            }
        }
        return flatArray;
    }
}
