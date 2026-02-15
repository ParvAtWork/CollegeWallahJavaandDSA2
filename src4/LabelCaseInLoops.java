
//Note -: Break and Continue hamesha loops ka anadar hi aha gha vo bhi if condition ka sath or neccha.Always pay attention in the increment operators in the while and do while loops vo continue ya break sa phele likha jaye gha or loop close ka baad sop ka baad likha jaye gha.

import java.util.*;
//import java.util.Scanner;
//public class LabelCaseInLoops {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your Number");
//        int num = sc.nextInt();
//        outerloop:for (int i = 0; i <= num; i++) {
//            if (i == 3) {
//                continue outerloop;   //if want to stop whole process after i encounter the 3 while iteration then write break in place of continue.
//            }
//            System.out.println(i);
//
//        }
//
//    }
//}

public class LabelCaseInLoops {
    public static void main(String[] args) {
        outer:for(int i = 1; i <= 5; i++) {  //idhar iska meaning ya hai i ki value tho abhi 1 hai but i ka andar jo loop hai j uski values run kara ghi jab tak j break nahi hojata 3 par aha kar jab ya ho jaye gha tho i++ sa i =2 hojaye gha and so on.
            for(int j = 1; j <= 5; j++) {
                if(j == 3) {
                    continue outer; // skip current outer loop iteration
                     }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}

// Explnation of the code
//Normally continue sirf current loop iteration ko skip karta hai.
//
//Lekin agar tum continue outer likhte ho, toh iska matlab hai:
//“current inner loop ko turant chhodo aur outer loop ke agle iteration par chale jao.”
//
//i = 1, j = 1 → print
//
//        i = 1, j = 2 → print
//
//        i = 1, j = 3 → condition true → continue outer → inner loop skip → outer loop next iteration (i = 2)
//
//Fir i = 2 ke liye j loop start hoga.
//
//Har baar jab j == 3 hoga, inner loop turant chhod diya jaayega aur outer loop next i par jump karega.

//Output of the code
//i = 1, j = 1
//i = 1, j = 2
//i = 2, j = 1
//i = 2, j = 2
//i = 3, j = 1
//i = 3, j = 2
//i = 4, j = 1
//i = 4, j = 2
//i = 5, j = 1
//i = 5, j = 2
