import java.util.Scanner;
import java.util.ArrayList;

public class DoingArrayListExampleByTakingUserInputWithOneClassAndTwoMethodOnly {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        System.out.println("Enter the number that how how much amount of array you want:");
        int n = sc.nextInt();

        for(int i=0; i < n ; i++){
            System.out.println("Enter the input value for index " + (i + 1) + " : ");
            int value = sc.nextInt();
            List.add(value);

//            System.out.println("ArrayList Elements are: " + List);
        }
        System.out.println("ArrayList Elements are: " + List);
        SelectingIndiviualElement(List);
        sc.close();

    }
    static void SelectingIndiviualElement(ArrayList<Integer> List){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index value you want to access: ");
        int indexValue = sc.nextInt();
        if(indexValue >=0 && indexValue < List.size()){
            System.out.println("Element at index " + indexValue + " is: " + List.get(indexValue));
        }else{
            System.out.println("You have the given the wrong index Value: ");
        }
        sc.close();

    }

}
