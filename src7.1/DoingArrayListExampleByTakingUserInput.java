import java.util.Scanner;
import java.util.ArrayList;

public class DoingArrayListExampleByTakingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();

        System.out.println("Enter the number for amount of values you want:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Element input for " + (i + 1)  + " is:");
            int value = sc.nextInt();
            List.add(value);
        }

        System.out.println("ArrayList Elements: " + List);
        new2.callingIndiviualValue(List);
        sc.close();
    }
}
    class new2{
    static void callingIndiviualValue(ArrayList<Integer> List) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to access:");
        int index = sc.nextInt();
        if (index >= 0 && index < List.size()) {
            System.out.println("Element at index " + index + " is: " + List.get(index));
        }else{
            System.out.println("Invalid index given that is : " + index);
        }
        sc.close();
    }
}

