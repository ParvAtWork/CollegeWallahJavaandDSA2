import java.util.Scanner;
public class ReadCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        char readCharacter1 = sc.next().charAt(0);
        System.out.println("The character of string is: " + readCharacter1);
        sc.close();

    }
}