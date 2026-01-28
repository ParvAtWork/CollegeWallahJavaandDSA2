//1. for Loop
//        -> Fixed number of iterations ke liye best.
//        Syntax:
//        for(initialization; condition; update) {
//        // code
//        }
//
//        Example:
//        for(int i = 1; i <= 5; i++) {
//        System.out.println("i = " + i);
//        }



import java.util.Scanner;
public class PracticeLoopingOfForLoop {
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the loop number");
        int n = sc.nextInt();
        for(int i=0 ; i < n ; i++ ){
            System.out.println("Hello World");
        }
        sc.close();
    }
}
