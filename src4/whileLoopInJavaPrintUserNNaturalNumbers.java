//while Loop
//       -> Jab iterations ka count pehle se pata nahi ho.
//        Syntax:
//        while(condition) {
//        // code
//        }
//
//Example:
//int i = 1;
// while(i <= 5) {
//        System.out.println("i = " + i);
//            i++;
//        }

import java.util.*;
import java.util.Scanner;
public class whileLoopInJavaPrintUserNNaturalNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Natural Number");
        int n = sc.nextInt();
        int i = 1;  //i loop mein chalo gha uski starting place bhi tho define karo gha.
         while(i <= n){  //Here n is the target given by the user up till which number loop should run.
             System.out.println(i);  //we are printing i because it will run in the loop
               i++;
         }
     sc.close();
    }

}
