import java.util.Scanner;
public class TakingInputOfAnArrayIUsingEnhancedForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array");
        int[] arr = new int[5];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        for(int num:arr){ //This is enhanced loop for an array , which says for every element in array , print the element
            System.out.print(num + " "); // here num represents the element of an array
        }
        sc.close();

    }
}
