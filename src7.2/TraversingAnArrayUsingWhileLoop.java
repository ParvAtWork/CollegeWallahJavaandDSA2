import java.util.Arrays;

public class TraversingAnArrayUsingWhileLoop {
    public static void main(String[] args){
        int[] age = {1,2,3,4,5};
        int i = 0;
        while(i < age.length){
//            System.out.println(Arrays.toString(age));
            i++;
        }
        System.out.println(Arrays.toString(age));
    }
}
