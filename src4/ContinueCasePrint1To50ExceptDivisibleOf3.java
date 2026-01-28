import java.util.*;
import java.util.Scanner;
public class ContinueCasePrint1To50ExceptDivisibleOf3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value");
        int num = sc.nextInt();
        int i = 1;
        while(i <= num){
            if(i % 3 == 0){
                i++; // increment before skipping
                continue;  // skip divisible by 3
            }  //If mein continue ke just baad i++ likh tha tho meri i++ wali line kabhi execute hi nahi hoti.
            System.out.println(i);
            i++;  //Agar tum i++ uske baad nahi likhoge, to loop same value of i baar‑baar print karega → infinite loop ban jaayega.Isliye har iteration ke baad i ko increment karna zaroori hai taaki loop agle number pe move kare.
        }
        sc.close();
    }
}
//Note -: when if condition true hojati hai then continue ke baad ka koyi bhi statement nahi chale gha such as sopln and i++ or if jo hamari iterated value hai vo if condition nahi follow kara ghi tho vo sopln and i++ wala follow kara ghi if conditional ka bahar.
