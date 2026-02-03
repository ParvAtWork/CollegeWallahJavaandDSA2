import java.util.Scanner;

class NewAlgebraa {
    static int add(int a, int b) {
        System.out.println("Values received from the main method: a = " + a + "b = " + b);
        //The below are the example of the block level scoping.
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter another value for a(Block Scope): ");
            int aBlock = sc.nextInt();
        }
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the another value for b(Block Scope): ");
            int bBlock = sc.nextInt();
        }
        return a+b;

    }

}

public class BlockLevelScoping {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a =sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        int sum = NewAlgebraa.add(a,b); //Here direct calling the add method by using classname because method and varaible are static in nature.
        System.out.println("The sum value is: " + sum);
    }
}
//int sum = NewAlgebraa.add(a,b); This is the