import java.util.Scanner;
import java.util.ArrayList;

public class PracticeOnly {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        addElements(List);
        updateValue(List);
        getValueFromIndex(List);


    }

    static void addElements(ArrayList<Integer> List) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in List: ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the Value you want in List for Position " + (i + 1));
            int value = sc.nextInt();
            List.add(value);
            System.out.println("The value " + value + " for Position " + (i + 1) + " is successfully added to the List ");
        }
        System.out.println("The List in the Single line is: ");
        System.out.println(List);

    }

    static void updateValue(ArrayList<Integer> List) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Index number for which you want to update an index: ");
        int indexNumber = sc.nextInt();
        System.out.println("Enter the New Value for which you want to update an index " + indexNumber );
        int newValue = sc.nextInt();
        List.set(indexNumber - 1, newValue);
        System.out.println("The New Value " + newValue + " for which you want to update an index " + indexNumber);
        System.out.println("The after the Updation is ");
        System.out.println(List);
    }
    public static void getValueFromIndex(ArrayList<Integer> List){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Index number from which you want to get the value: ");
        int getIndex = sc.nextInt();
        int valueGet = List.get(Integer.valueOf(getIndex-1));
        System.out.println(valueGet);
    }
}

