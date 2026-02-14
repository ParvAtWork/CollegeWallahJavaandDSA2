import java.util.*;
import java.util.Scanner;

//The below code is the example of the non-static classes one.
class Algebra {
     int a; // Ya member variable is class ka inn ko hum kahi bhi access kar sakh tha hai iss class mein bana kisi bhi method mein.
     int b;


     int add(){
        return a + b;
    }
    int sub(){
         return a - b;
    }
    int mul(){return a*b;}

}





public class ClassLevelScope {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for a");
        int a = sc.nextInt();
        System.out.println("Enter the value for b");
        int b = sc.nextInt();
        //Phele object banao non static class access karna ka liya phir uska nicha objects ki values bhi assign karo.
        Algebra obj1 = new Algebra();
        obj1.a = a;
        obj1.b = b;
        int add = obj1.add();
        int sub = obj1.sub();
        int mul = obj1.mul();
        System.out.println("The addition of given numbers are: " + add );
        System.out.println("The subtraction of given numbers are: " + sub);
        System.out.println("The Multiplication of given numbers are: " + mul);



    }
}

//This code is used when static is used in the code
/*class Algebra{
    static int a;
    static int b;

    static int add(){
        return a+b;
    }
    static int sub(){
        return a-b;
    }
    static int mul(){
        return a*b;
    }
}

public class ClassLevelScope{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for a");
        int a = sc.nextInt();
        System.out.println("Enter the value for b");
        int b = sc.nextInt();
        Algebra.a=a;
        Algebra.b=b;
        int add = Algebra.add();
        int sub = Algebra.sub();
        int mul = Algebra.mul();
        System.out.println("The addition of given numbers are: " + add);
        System.out.println("The subtraction of the given numbers are: " + sub);
        System.out.println("The multiplication of the given numbers are: " + mul);

    }
}
*/

