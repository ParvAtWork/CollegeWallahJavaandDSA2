//Agar tumhe characters horizontal with spaces chahiye → System.out.print(ch + " ");
//Agar tumhe characters horizontal without spaces chahiye → System.out.print(ch);
//Agar tumhe characters vertical chahiye → System.out.println(ch);

import java.util.Scanner;
public class ReadAllCharactersOfString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String newS = sc.nextLine();       // Scanner class method you can study about it from file TakingInputUsingScannerClass
                                                   //i ek counter variable hai jo string ke index ko represent karta hai.
        for(int i = 0 ; i < newS.length() ; i++){  //Condition i < newS.length() ensure karti hai ki loop tab tak chale jab tak i string ke last index se chhota hai.
            char ch = newS.charAt(i);
            System.out.print(ch + " ");

        }
        sc.close();

    }

}
