//Note -> To print 2Darray we do Arrays.deepToString( array reference variable) but ya 2D array ko ek hi line mein print kar deta hai, jaise: ya [[2, 3, 4], [5, 6, 7], [8, 9, 10]]
import java.util.Arrays;
public class Printing2DArrayByTakingIntegerInCode {
    public static void main(String[] args){
        int[][] arr = { {2,3,4},
                        {5,6,7},
                        {8,9,10}};
        for(int i = 0 ; i<1 ; i++){
            System.out.print(Arrays.deepToString(arr));
        }

    }
}
