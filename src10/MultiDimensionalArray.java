import java.util.Scanner;
import java.util.ArrayList;
public class MultiDimensionalArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Elements");
        ArrayList<ArrayList<Integer>> List = new ArrayList<>();
        //ArrayList Initilzation part
        for(int i = 0; i<3 ; i++){
            List.add(new ArrayList<>());
        }

        //add element in the list
        for(int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                List.get(i).add(sc.nextInt()); //Here this line is saying "Get the arrayList at the index i and add something to it.
            }
            System.out.println(List);
        }
    }

}
