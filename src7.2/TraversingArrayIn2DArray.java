import java.util.Arrays;

public class TraversingArrayIn2DArray {
    public static void main(String[] args) {
        int[][] twoDArray = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //This first loop will for the each array present in the 2D array.
        for (int i = 0; i < twoDArray.length; i++) {
            //This second loop run to access the elements which are present in the each array in the 2D array
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
//        System.out.println();
    }
}
