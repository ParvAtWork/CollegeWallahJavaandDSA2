import java.util.Scanner;
import java.util.ArrayList;

public class PerformingAllOperationsInArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();

        System.out.println("Enter the value for amount of elements you want in your List: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value for the position in you List " + (i + 1));
            int value = sc.nextInt();
            AddingAnValue(List, value); //Ya yada rakho jab koyi bhi value tum loop mein declare karo srif loop mein tab tum tab tum function call bhi srif loop mein karo gha jaha tak uski range hai.
        }
        System.out.println(List);
        GettingTheUserAskedValue(List);
        UpdatingElementInArray(List);
        removeElementFromGivenIndex(List);
        removeElementByValue(List);
        SearchingPart(List);
        Clear(List);
        CheckingEmpty(List);


    }

    static void AddingAnValue(ArrayList<Integer> List, int value) { //Jo function ya method banao gha uss mein Parameter pass kara tha hua DataType + Reference Variable name bhi likho gha jis mein tum apna object store karo gha.
        List.add(value);
        System.out.println("Value " + value + " is successfully added: ");
    }

    static void GettingTheUserAskedValue(ArrayList<Integer> List) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index value for which you want to get the value: ");
        int indexVal = sc.nextInt();
        for (int i = 0; i < 1; i++) {
            int AccessedValue = List.get(indexVal - 1);
            System.out.println("The Accessed value is at index " + (indexVal));
            System.out.println(AccessedValue);
        }
    }

    static void UpdatingElementInArray(ArrayList<Integer> List) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Index value for which you want to update the number: ");
        int setValue = sc.nextInt();
        System.out.println("Enter the replacing value");
        int newValue = sc.nextInt();
        //Yaha pa setvalue-1 iss liya kari because jo compiler hai vo tho value o sa n tak le gha par user tho 1 sa n tak lega na tho agar user 3 likha gha tho compiler 0 sa 3 tak count kara gha but setvalue-1 karna sa vo 4 element na dekh ka 3 elemnt update kara gha .
        List.set(setValue - 1, newValue); // set mein hamesha 2 argument pass hogha (index , newvalue or updation value)
        System.out.println("The Updated List is: ");
        System.out.println(List);
    }

    static void removeElementFromGivenIndex(ArrayList<Integer> List) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Index value for which you want to remove the element from the List: ");
        int removingIndexVal = sc.nextInt();
        int UpdatedList = List.remove(removingIndexVal - 1);
        System.out.println("The value which is Removed from the Array is: " + UpdatedList);
        System.out.println(List);
    }

    static void removeElementByValue(ArrayList<Integer> List) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value that you want to delete from and List: ");
        int removeByValue = sc.nextInt();
        for (int i = 0; i < 1; i++) {
            if (List.contains(removeByValue)) {  //In this code i have done searching Part too
                List.remove(Integer.valueOf(removeByValue));
                System.out.println("The new Updated List is: ");
                System.out.println(List);

            } else {
                System.out.println("Value not found: ");
            }
        }
    }
    static void SearchingPart(ArrayList<Integer> List){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value which you want to Search: ");
        int SearchingValue = sc.nextInt();
        if(List.contains(SearchingValue)){
            System.out.println("Element found: ");
        }else{
            System.out.println("Sorry you have entered Wrong Value!: ");
        }
    }
    static void Clear(ArrayList<Integer> List){
        List.clear();
        System.out.println("The List is cleared now: ");
    }

    static void CheckingEmpty(ArrayList<Integer> List){
       if(List.isEmpty()){
           System.out.println("The List is Empty now: ");
       }
    }
}
