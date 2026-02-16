import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class AddingElementUsingAnArrayList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Array = new ArrayList<>();

        System.out.println("Enter the value for number of elements you want in Array: ");
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
            System.out.println("Enter the value for the Position " + (i+1));
            int value = sc.nextInt();
            Array.add(value);
        }
        System.out.println("ArrayList Elements are: " );
        System.out.println(Array);
        AccesingAnElementFromArray(Array);
        sc.close();


    }

    static void AccesingAnElementFromArray(ArrayList<Integer> Array){
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 1 ; i++){
            System.out.println("Enter the index for which you want to get the element of Array: " );
            int index= sc.nextInt();
            int accessedValue = Array.get((index-1));
            System.out.println("The accessed value is given below: ");
            System.out.println(accessedValue);
        }
    }

}
