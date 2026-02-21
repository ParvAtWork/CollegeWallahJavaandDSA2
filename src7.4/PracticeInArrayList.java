import java.util.Scanner;
import java.util.ArrayList;
public class PracticeInArrayList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();

        System.out.println("Enter the Number of elements you want in List: ");
        int number = sc.nextInt();

        for(int i = 0 ; i < number ; i++){
            System.out.println("Enter the value for index " + (i+1));
            int value = sc.nextInt();
            addingElementsInList(List,value);
        }
        System.out.println("The List in Single Line is: ");
        System.out.println(List);
        gettingAnElementFromAnIndex(List);
        updatingElementInTheArray(List);
        updationInUnique(List);
        removingElementFromTheUserGivenIndex(List);

    }
    static void addingElementsInList(ArrayList<Integer> List , int value){
        List.add(value);
        System.out.println("The value is Successfully added in the List: ");

    }
    static void gettingAnElementFromAnIndex(ArrayList<Integer> List){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index value for which you want to get the element value from the List: ");
        int indexValueForElement = sc.nextInt();
        int getValueWhichWeAskedFor = List.get(indexValueForElement - 1);
        System.out.println("The value at  " + indexValueForElement + " is: ");
        System.out.println(getValueWhichWeAskedFor);

    }
    static void updatingElementInTheArray(ArrayList<Integer> List){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the index value for which you want to change the value: ");
        int indexForValueChange = sc.nextInt();
        System.out.println("Now the enter the value for Element: ");
        int valueChange = sc.nextInt();
        List.set(indexForValueChange - 1, valueChange);
        System.out.println("The List after Changes You asked for is: ");
        System.out.println(List);
    }

    static void updationInUnique(ArrayList<Integer> List ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value by which you want to increase every element in an List: ");
        int incValue = sc.nextInt();
        for(int j = 0 ; j < List.size() ; j++){
            List.set(j , List.get(j)+ incValue);
        }
        System.out.println("List after all value get Updated: ");
        System.out.println(List);
    }
    static void removingElementFromTheUserGivenIndex(ArrayList<Integer> List){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index number fom which you want to delete the element ");
        int IndexValueToRemove = sc.nextInt();
        int updatedListValue = List.remove(IndexValueToRemove-1);
        System.out.println("The value which is removed from the Array is " + updatedListValue);
        System.out.println(List);
    }

}
