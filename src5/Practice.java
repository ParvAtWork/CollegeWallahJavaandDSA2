//import java.util.*;
//import java.util.Scanner;
//public class Practice {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number a and b");
//        int num_a = sc.nextInt();  int num_b = sc.nextInt();
//        int ans = 1;
//        for(int i = 1 ; i <= num_b ; i++){
//            ans *= num_a;
//        }
//        System.out.println(ans);
//        sc.close();
//    }
//}
//below is the count the digit the number entered by the user
//import java.util.*;
//import java.util.Scanner;
//public class Practice{
//public static void main(String[] args){
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter your Number");
//    int num = sc.nextInt();
//    int digitcount = 0;
//    while(num > 0){
//        num = num / 10;
//        digitcount++ ; //digitcount = digitcount + 1;
//    }
//    System.out.println(digitcount);
//
//}
//}
//import java.util.*;
//import java.util.Scanner;
//public class Practice{
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter you number for num_a");
//        int num_a = sc.nextInt();
//        System.out.println("Enter the number for num_b");
//        int num_b = sc.nextInt();
//        int ans = 1;
//        for(int i = 1 ; i<=num_b ; i++){
//            ans *= num_a;
//        }
//        System.out.println(ans);
//
//    }
//}

//import java.util.*;
//import java.util.Scanner;
//public class Practice{
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your Number");
//        int num = sc.nextInt();
//        int fact = 1;
//        for(int i = 1; i <=num ; i ++){
//            fact = fact*i;
//            System.out.println("The factorial for each " + i +  " during iteration is " + fact);
//        }
//        sc.close();
//
//    }
//}

import java.util.*;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int rev = 0;
        int remainder = 0;
        while (num > 0) {
            remainder = num % 10;
            rev = rev * 10 + remainder;
            num = num / 10;

        }
        System.out.println(rev);
    }
}



