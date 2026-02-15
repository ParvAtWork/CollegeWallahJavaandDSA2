import java.util.Arrays;
import java.util.Scanner;

public class SearchingAnArrayElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] OriginalArray = new int[5];
        System.out.println("Enter any value 5 random values to store them in Array: ");
        for(int i = 0; i < OriginalArray.length ; i++){
            System.out.println("Enter the value for the index " + (i+1) );
            OriginalArray[i] = sc.nextInt();
        }
        System.out.println("The original Array is: ");
        System.out.println(Arrays.toString(OriginalArray));
        SearchingPart(OriginalArray);

    }

    static void SearchingPart(int[] OriginalArray){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value you want search: ");
        int searchingValue = sc.nextInt();
        boolean found = false;  // boolean hum phele false hi rakha gha because jab tak traversing ho rahi or element nahi mil raha tab tak false hi raha
        for(int i = 0 ; i < OriginalArray.length ; i++){
            if(OriginalArray[i] == searchingValue){
                System.out.println("Searching Value found at index " + (i+1));
                found = true;
                break;  //Stop the full programe here.
            }
        }
        if(!found){
            System.out.println("Element not found");
        }

    }
}
