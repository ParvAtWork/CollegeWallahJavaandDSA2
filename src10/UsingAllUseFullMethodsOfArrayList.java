import java.util.Scanner;
import java.util.ArrayList;
public class UsingAllUseFullMethodsOfArrayList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        // For adding the element in the array we use.
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        System.out.println(List);
        //For updating we use
        List.set(1,1);
        System.out.println(List);
        //For Accessing the Element we use
        System.out.println(List.get(2));
        //For checking the element in the Array we use
        System.out.println(List.contains(3));
        //For Removing the element from the list
        List.remove(1);
        System.out.println(List);
        //For checking the size of an array
        System.out.println(List.size());
        //For clearing an array
        List.clear();
        System.out.println(List);
        //To check is the array is empty or not.
        System.out.println(List.isEmpty());


    }
}
