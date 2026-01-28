//3. do-while Loop(Iss mein first iteration hamesha execute hoti hai if agar vo false bhi ho tho tab bhi execute hoghi and second iteration exit kar jaye ghi.)
//       -> At least ek baar execute hoga, chahe condition false ho.
//        Syntax:
//        do {
//        // code
//        } while(condition);
//
//Example:
//      int i = 1;
//       do {
//            System.out.println("i = " + i);
//             i++;
//        } while(i <= 5);

import java.util.*;
import java.util.Scanner;
public class DoWhileLoopingInJava {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i = 10;
        do{
            System.out.println("i = " + i);
            i++;
        }while(i <= n );

        sc.close();

        }

    }

