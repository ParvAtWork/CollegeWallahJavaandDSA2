//import java.util.Arrays;
//public class Printing2DArray {
//    public static void main(String[] args){
//    int[][] twoDMatrix = {{1,2,3},
//                           {4,5,6},
//                           {7,8,9}
//                           };
//        System.out.println("Elements of the 2D Matrix are: ");
//    for(int i = 0; i < twoDMatrix.length ; i++){
//        for(int j = 0; j < twoDMatrix[i].length ; j++){
//          System.out.print(twoDMatrix[i][j] + " ");
//            System.out.println(Arrays.deepToString(twoDMatrix));
//        }
//        System.out.println();
//    }
//    }
//}


import java.util.Arrays;
public class Printing2DArray  {
    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}
        };
        System.out.print(Arrays.deepToString(matrix));
    }

}
