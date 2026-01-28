//🔑 Input in Java
//Java mein input lene ke liye sabse common class hai Scanner.
//
// 1. Scanner Class
//Located in: java.util package
//
//Purpose: User se input lene ke liye (keyboard, file, etc.)
//
//Import statement:
//import java.util.Scanner;

//3. Common Methods of used in Scanner
//nextInt() → integer input lene ke liye Example ->int age = sc.nextInt();
//
//nextDouble() → Double input lene ke liye Example ->double pi = sc.nextDouble();
//
//nextLine() →Puri line input lene ke liye (spaces ke saath) Example-> String sentence = sc.nextLine();
//
//next() → Single word input lene ke liye (space tak) Example->String name = sc.next();
//
//nextBoolean() → Boolean input (true/false) lene ke liye  Examples->boolean flag = sc.nextBoolean();
//
//nextFloat()->To take float values as input. Example->float marks = sc.nextFloat();
//
//nextByte()->Byte input lene ke liye (range -128 to 127) Example->byte b = sc.nextByte();
//
//nextLong()->Long integer input lene ke liye Example ->long pop = sc.nextLong();
//
//nextShort()->Short input lene ke liye Example -> short s= sc.nextShort();
//
//hasNextInt()->Check karta hai ki next token integer hai ya nahi  Example ->if(sc.hasNextInt()) { ... }
//
//hasNextLine()->Check karta hai ki aur line available hai ya nahi Example ->if(sc.hasNextLine()){...}
//
//close()->Scanner object ko close karne ke liye (best practice) Example ->sc.close();
import java.util.*;
import java.util.Scanner; //here importing scanner class from the util pakage.
public class TakingInputUsingScannerClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //To use Scanner we have to make the Scanner class object here sc is the scanner class object.
        System.out.println("Enter Your Name");
        String name_2 = sc.nextLine();
        System.out.println("Hello Mr. " + name_2);

        System.out.println("Enter Your lucky Number");
         int num_1 = sc.nextInt();
         sc.nextLine(); // 👈 consume newline left after nextInt() taa ki newline consume ho jaa ye. Aur string concatenation mein space " " bhi ensure karna hoga. because it was joining the two strings together like "Mr.ParvYours"
         System.out.println("Your lucky number is " + num_1);
         System.out.println("Hello Mr. " + name_2 + " Your lucky number is " + num_1);
    }

}
