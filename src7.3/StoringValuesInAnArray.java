import java.util.*;
public class StoringValuesInAnArray {
    public static void main(String[] args){
        int[] storeArr = new int[5];

        storeArr[0] = 10;
        storeArr[1] = 20;
        storeArr[2] = 30;
        storeArr[3] = 40;
        storeArr[4] = 50;

        System.out.println("Stored values are:");
           for(int i = 0 ; i < storeArr.length ; i++){

        }
           System.out.print(Arrays.toString(storeArr) + " ");
    }

}
