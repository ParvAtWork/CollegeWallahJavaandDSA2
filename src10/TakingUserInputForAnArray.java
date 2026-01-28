import java.util.Scanner;
import java.util.ArrayList;
public class TakingUserInputForAnArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        ArrayList<Integer> List = new ArrayList<>();
        //For taking input
        for(int i=0;i<5;i++){
            List.add(sc.nextInt());
        }
        //Get item at any index
        for(int i =0 ; i<5; i++){
            System.out.println("Index " + i + " -> " + List.get(i));
        }
    }
}

/*
 * ArrayList.get(index) ka matlab:
 * --------------------------------
 * - ArrayList ek dynamic array hai jisme elements index ke basis par store hote hain.
 * - Indexing hamesha 0 se start hoti hai (pehla element index 0 par hota hai).
 * - get(index) method us position par rakhe element ko return karta hai.
 *
 * Example:
 * ArrayList<Integer> list = new ArrayList<>();
 * list.add(10); // index 0
 * list.add(20); // index 1
 * list.add(30); // index 2
 *
 * System.out.println(list.get(0)); // Output: 10
 * System.out.println(list.get(1)); // Output: 20
 * System.out.println(list.get(2)); // Output: 30
 *
 * Agar tum invalid index doge (jaise list.get(5) jab size 3 hai),
 * to IndexOutOfBoundsException aayega.
 *
 * Short Note:
 * get(i) = "ArrayList ke i-th element ko access karo"
 */

/*
 * Dabbe wali explanation of List.get(i):
 * --------------------------------------
 * Socho ek shelf hai jisme dabbe (boxes) rakhe hain.
 * Har dabbe ka ek number hota hai (index).
 *
 * Example:
 * Index:   0    1    2    3    4
 * Value:  10   20   30   40   50
 *
 * - list.get(0) => pehla dabba kholo -> value = 10
 * - list.get(1) => dusra dabba kholo -> value = 20
 * - list.get(2) => teesra dabba kholo -> value = 30
 *
 * Matlab: get(i) ka kaam hai "i number wale dabbe ko kholo aur uski value nikal ke do".
 *
 * Note:
 * Agar tum aisa index doge jo exist nahi karta (jaise list.get(10) jab size 5 hai),
 * to error aayega: IndexOutOfBoundsException.
 */
