import java.util.Scanner;
import java.util.Arrays;
public class ChangeTheStringInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String of words");
        String[] str = new String[4];
        for(int i = 0 ; i < str.length ; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
        str[2] = "Rayadu";
        System.out.print(Arrays.toString(str));
        sc.close();
    }
}
