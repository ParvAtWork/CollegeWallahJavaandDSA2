import java.util.Arrays;
import java.util.Scanner;

class LengthExample {
    static void CheckLength1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String[] Name = new String[4];
        for (int i = 0; i <Name.length; i++) {
            Name[i] = sc.next();
        }
        System.out.println(Arrays.toString(Name));
        System.out.println(Name.length);
        sc.close();
    }
}

    public class LengthOperationInArrayByUsingLoop {
        public static void main(String[] args) {
            LengthExample obj = new LengthExample();
            LengthExample.CheckLength1();

        }
    }

